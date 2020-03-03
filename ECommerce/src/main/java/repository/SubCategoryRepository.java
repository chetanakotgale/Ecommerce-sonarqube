package repository;

import java.sql.SQLException;

public interface SubCategoryRepository 
{
	
	public void getSubCategories(int subcategorychoice) throws ClassNotFoundException, SQLException;


}
