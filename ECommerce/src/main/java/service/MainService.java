package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import constant.ConstantVariable;
import controller.HomePage;
import exception.InputMisMatchException;
import validate.ValidateInput;

public class MainService 
{
	
	
	static Logger logger = LogManager.getLogger(MainService.class);	
	
	static String lineSeparator = ConstantVariable.LINESEPARATOR;
	
	Scanner scan = new Scanner(System.in);
	
	static String enterValidOption = "{}"+"Enter a valid option";
	
	List<String> categoryList = new ArrayList<>();
	List<String> subcategoryList = new ArrayList<>();
	List<String> productList = new ArrayList<>();
	
	int index = 0;
	
	public void display() throws InputMisMatchException, ClassNotFoundException, SQLException 
	{
		
		displayCategory();
		displaySubCategory();
		displayProduct();
	}
		
		
	private void displayCategory() throws ClassNotFoundException, SQLException 
	{
		
		CategoryService categoryservice = new CategoryService();
		
		categoryservice.displayCategories();
		
	}

	
	private void displaySubCategory() throws ClassNotFoundException, SQLException 
	{
		index = 0;
		
		logger.info("Select the subcategory");
		
		int subcategorychoice = ValidateInput.validate();		

		if(subcategorychoice > 2)
		{
			logger.info(enterValidOption , lineSeparator);
			
			subcategorychoice = ValidateInput.validate();
		}
		
		SubCategoryService subcategoryservice = new SubCategoryService();
		
		subcategoryservice.displaySubCategory(subcategorychoice);
		
	}	
	
	
	private void displayProduct() throws InputMisMatchException, ClassNotFoundException, SQLException
	{
		index = 0;
		
		int productchoice = ValidateInput.validate();
		
		logger.info("Select the product");
		
		if(productchoice > 6)
		{
			logger.info(enterValidOption , lineSeparator);
			
			productchoice = ValidateInput.validate();
			
		}
		
		ProductService productService = new ProductService();
		
		productService.displayProducts(productchoice);
		
		selectProduct();
	}

	private void selectProduct() throws ClassNotFoundException, SQLException, InputMisMatchException
	{
		logger.info("Select a product you want to purchase");
		
		int selectedProduct = scan.nextInt();
		
		logger.info("Select the quantity of the product you want to purchase");
		
		int quantity = scan.nextInt();
		
		CartService.addCart(selectedProduct, quantity);
		
		afterOperationOnCart();

	}
	
	
	public static void afterOperationOnCart() throws InputMisMatchException, ClassNotFoundException, SQLException
	{
		logger.info("{}1- View Cart {}2 - Continue Shopping{}", lineSeparator,lineSeparator,lineSeparator);
		
		int option = ValidateInput.validate();
		
		switch(option)
		{
			case 1:		CartService.displayCart();
						break;
				
			case 2:		HomePage.shop();
						break;
						
			default:	logger.info(enterValidOption , lineSeparator);
						afterOperationOnCart();
						break;
		}
		
	}

		
			
}
	
