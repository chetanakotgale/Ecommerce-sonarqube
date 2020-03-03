package repository;

import java.sql.SQLException;

import exception.InputMisMatchException;

public interface CartRepository 
{
	
	public void addToCart(int productID, int productQuantity) throws ClassNotFoundException, SQLException;

	public void removeCart() throws InputMisMatchException, ClassNotFoundException, SQLException;

	public void displayCart() throws SQLException, ClassNotFoundException;

	public void updateProductTable() throws ClassNotFoundException, SQLException, InputMisMatchException;


}
