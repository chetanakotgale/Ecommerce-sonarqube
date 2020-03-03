package service;

import java.sql.SQLException;

import repository.ProductRepository;
import repository.repoimp.ProductRepositoryImp;

public class ProductService 
{
	
	ProductRepository product = new ProductRepositoryImp();
	

	public void displayProducts(int productchoice) throws ClassNotFoundException, SQLException
	{
		
		product.getProducts(productchoice);
		
	}

}
