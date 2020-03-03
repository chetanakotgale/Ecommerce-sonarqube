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
import entity.ProductEntity;
import repository.ProductRepository;

public class ProductRepositoryImp  implements ProductRepository
{
	
	Logger logger = LogManager.getLogger(ProductRepositoryImp.class);	
	
	static String lineSeparator = ConstantVariable.LINESEPARATOR;
	
	Scanner scan = new Scanner(System.in);

	ProductEntity product = new ProductEntity();

	List<String> productList = new ArrayList<>();
	
	CartRepositoryImp cart = new CartRepositoryImp();
	
	public void getProducts(int productchoice) throws ClassNotFoundException, SQLException
	{

		String query = "select * from product";
		
		PreparedStatement preparedStatement = Database.getPreparedStatement(query);
		
		ResultSet result = preparedStatement.executeQuery();

		logger.info("{}",lineSeparator);
		
		while(result.next())
		{		
			if(result.getInt(2) == productchoice)
			{
				
				logger.info("{}\t{}\t{}\t{}\t",result.getString("productID"),result.getString("productName"),result.getString("productQuantity"),result.getString("productPrice"));
				
			}
		}
		
		result.close();
		
	}

	

}