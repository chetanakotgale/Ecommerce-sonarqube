package service;

import java.sql.SQLException;

import repository.SubCategoryRepository;
import repository.repoimp.SubCategoryRepositoryImp;

public class SubCategoryService 
{
	int initialValue = 0;
	
	SubCategoryRepository subcategory = new SubCategoryRepositoryImp();
	
	
	public void displaySubCategory(int subcategorychoice) throws ClassNotFoundException, SQLException
	{
		
		subcategory.getSubCategories(subcategorychoice);
			
	}
	

}
