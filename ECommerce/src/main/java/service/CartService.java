package service;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import controller.HomePage;
import exception.InputMisMatchException;

import repository.CartRepository;
import repository.repoimp.CartRepositoryImp;
import validate.ValidateInput;

public class CartService 
{
	
	static CartRepository cart = new CartRepositoryImp();
	
	public static void displayCart() throws InputMisMatchException, ClassNotFoundException, SQLException
	{
		Scanner scan = new Scanner(System.in);
		cart.displayCart();
		Logger logger = LogManager.getLogger(CartService.class);	
		
			System.out.println("\n1 - Place your order\n2 - Remove Product From Cart \n3 - Continue Shopping\n");
			
			int option = ValidateInput.validate();
			
			switch(option)
			{
			case 1: 	System.out.println("-----------------------------------------------------------------------------------");
						cart.updateProductTable();
						logger.info("Your order is placed...Thank you for shopping...!!!");
						break;
						
			case 2: 	cart.removeCart();
						break;
				
			case 3:		HomePage.shop();
						break;
						
			default:	logger.info("Enter a valid option\n");
						displayCart();
						break;
			}
		
		scan.close();
		
	}


	public static void addCart(int selectedProduct, int quantity) throws ClassNotFoundException, SQLException 
	{
		cart.addToCart(selectedProduct,quantity);
		
	}

}

