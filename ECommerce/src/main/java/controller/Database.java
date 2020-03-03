package controller;

import java.sql.*;


public class Database
{
	Database()
	{}
	
	public static PreparedStatement preparedStatement;
	
	
	public static PreparedStatement getPreparedStatement(String query) throws ClassNotFoundException, SQLException
	
	{
		Class.forName(com.mysql.cj.jdbc.Driver.class.getName());
		
		try(Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Epam1234$"))
		{
		
		preparedStatement = connect.prepareStatement (query);
		return preparedStatement;
		}
		
		
	}
	
}
