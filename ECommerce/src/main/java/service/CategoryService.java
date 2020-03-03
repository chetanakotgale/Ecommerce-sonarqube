package service;

import java.sql.SQLException;

import repository.CategoryRepository;
import repository.repoimp.CategoryRepositoryImp;

public class CategoryService 
{
	CategoryRepository categoryRepository = new CategoryRepositoryImp();	
	
	
	public void displayCategories() throws ClassNotFoundException, SQLException
	{
		categoryRepository.getCategories();
	}
		
}
