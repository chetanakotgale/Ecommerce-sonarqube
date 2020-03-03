package repository;

import java.sql.SQLException;

public interface ProductRepository 
{
	public void getProducts(int productchoice) throws ClassNotFoundException, SQLException;

}
