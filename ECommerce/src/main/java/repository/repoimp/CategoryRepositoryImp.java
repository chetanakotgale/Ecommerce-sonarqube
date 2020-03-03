package repository.repoimp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import constant.ConstantVariable;
import controller.Database;
import entity.CategoryEntity;
import repository.CategoryRepository;

 
public class CategoryRepositoryImp implements CategoryRepository
{
		
		Logger logger = LogManager.getLogger(CategoryRepositoryImp.class);	
		
		static String lineSeparator = ConstantVariable.LINESEPARATOR;
		
		CategoryEntity category=new CategoryEntity();
		
		List<String> categoryList = new ArrayList<>();
		
		int choice=0;
		
		Scanner scan = new Scanner(System.in);

		
		public void getCategories() throws ClassNotFoundException, SQLException 
		{
			String query = "select * from category";
			
			PreparedStatement preparedStatement = Database.getPreparedStatement(query);
			
			ResultSet result = preparedStatement.executeQuery();

			while(result.next())
			{		
				
				logger.info("{}\t{}",result.getString("categoryID"),result.getString("categoryName"));
			//	categoryList.add(result.getString("categoryName"));
				
			}
			
			result.close();
				
		}
		
}
