package repository.repoimp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import constant.ConstantVariable;
import controller.Database;
import entity.CartEntity;
import exception.InputMisMatchException;
import repository.CartRepository;
import service.MainService;

public class CartRepositoryImp  implements CartRepository
{
	
	Logger logger = LogManager.getLogger(CartRepositoryImp.class);	
	
	static String lineSeparator = ConstantVariable.LINESEPARATOR;
	
	Scanner scan = new Scanner(System.in);
	
	CartEntity cart = new CartEntity();
	
	static List<CartEntity> cartList = new ArrayList<>();
	
	int cartID = 0;

	public void addToCart(int productID, int productQuantity) throws ClassNotFoundException, SQLException 
	
	{
		String query = "insert into cart (cartID, productQuantity)" + "values(?,?)";
		
		PreparedStatement preparedStatement= Database.getPreparedStatement(query);
		
		preparedStatement.setInt(1 , productID);
		preparedStatement.setInt(2, productQuantity);
		
		preparedStatement.execute();

	}

	public void removeCart() throws InputMisMatchException, ClassNotFoundException, SQLException 
	{
		logger.info("Enter the productID you want to remove from cart {}",lineSeparator);
		
		int productID = scan.nextInt();
		
		String query = "delete from cart where cartID="+productID;
		
		PreparedStatement preparedStatement = Database.getPreparedStatement(query);
		
		preparedStatement.executeUpdate();
		
		logger.info("Product is removed from cart {}",lineSeparator);
		
		MainService.afterOperationOnCart();
		
	}

	public void displayCart() throws SQLException, ClassNotFoundException 
	{

		logger.info("productID\tproductName\tproductQuantity\tproductPrice\t{}",lineSeparator);
		
		String query1 = "select * from cart";
		
		PreparedStatement preparedStatementOfCart = Database.getPreparedStatement(query1);
			
		ResultSet cartResult = preparedStatementOfCart.executeQuery();

		while(cartResult.next())
		{	
			
			String query2 = "select * from product where productID="+cartResult.getInt("cartID");
			
			PreparedStatement PreparedStatementOfProduct = Database.getPreparedStatement(query2);
			
			ResultSet productInCart = PreparedStatementOfProduct.executeQuery();
			
			while(productInCart.next())
			{
				logger.info("{}\t\t{}\t\t{}\t\t{}\t",productInCart.getInt("productID"),productInCart.getString("productName"),cartResult.getInt("productQuantity"),productInCart.getInt("productPrice"));
				
			}
			productInCart.close();
			
		}
		
		cartResult.close();
		
	}

	public void updateProductTable() throws ClassNotFoundException, SQLException, InputMisMatchException
	{
		String query1 = "select * from cart";
		
		PreparedStatement preparedStatementOfCart = Database.getPreparedStatement(query1);
			
		ResultSet cartUpdate = preparedStatementOfCart.executeQuery();

		while(cartUpdate.next())
		{	
			int remainingQuantity = 10 - cartUpdate.getInt("productQuantity");
			
			String query2 = "update product set productQuantity="+remainingQuantity+" where productID="+cartUpdate.getInt("cartID");
			
			PreparedStatement PreparedStatementOfProduct = Database.getPreparedStatement(query2);
			
			PreparedStatementOfProduct.executeUpdate();

			
		}
		
		cartUpdate.close();
	}

}
