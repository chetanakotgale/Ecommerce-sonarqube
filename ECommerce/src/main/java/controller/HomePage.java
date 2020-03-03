package controller;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import constant.ConstantVariable;
import exception.InputMisMatchException;
import service.CartService;
import service.MainService;
import validate.ValidateInput;


public class HomePage
{
	static Logger logger=LogManager.getLogger(HomePage.class);
	
	static String lineSeparator = ConstantVariable.LINESEPARATOR;
	
	public static void main(String[] args) throws InputMisMatchException, ClassNotFoundException, SQLException
	{		
		
		logger.info("WELCOME TO ECART SERVICES  {} " ,lineSeparator);
		
		shop();
				
	}

	static MainService service = new MainService();
	
	public static void shop() throws InputMisMatchException, ClassNotFoundException, SQLException 
	{
		
		logger.info("1 - Start Shopping  {}2 - View Cart  {} ", lineSeparator, lineSeparator);
		
		Scanner scan = new Scanner(System.in);
		
		int option = ValidateInput.validate();
		
		switch(option)	
		{
		
		case 1: 	service.display();	
					break;
					
		case 2:		CartService.displayCart();
					break;
					
		default:	logger.warn("Enter a valid option {}",lineSeparator);	
					shop();
					break;
				
		}
		scan.close();
		
	}

}
