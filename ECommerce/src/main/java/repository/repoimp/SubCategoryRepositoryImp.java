package repository.repoimp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import constant.ConstantVariable;
import controller.Database;
import entity.SubCategoryEntity;
import repository.SubCategoryRepository;

public class SubCategoryRepositoryImp implements SubCategoryRepository 
{
	
	Logger logger = LogManager.getLogger(SubCategoryRepositoryImp.class);	
	
	static String lineSeparator = ConstantVariable.LINESEPARATOR;
	
	SubCategoryEntity subCategory = new SubCategoryEntity();
	List<String> subCategoryList = new ArrayList<>();
	
	
	public void getSubCategories(int subcategorychoice) throws ClassNotFoundException, SQLException 
	{
			
		String query = "select * from subcategory";
		
		PreparedStatement preparedStatement = Database.getPreparedStatement(query);
		
		ResultSet result = preparedStatement.executeQuery();

		while(result.next())
		{		
			if(result.getInt(1) == subcategorychoice)
			{
				
				logger.info("{}\t{}",result.getString("subcategoryID"),result.getString("subcategoryName"));
			}
		}
		
		result.close();
	
	}

	

}
