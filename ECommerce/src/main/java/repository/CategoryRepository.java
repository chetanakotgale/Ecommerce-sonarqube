package repository;

import java.sql.SQLException;

public interface CategoryRepository 
{
	public void getCategories() throws ClassNotFoundException, SQLException;

}
