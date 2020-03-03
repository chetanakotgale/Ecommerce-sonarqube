package entity;

import java.util.List;

public class CategoryEntity 
{
	private int categoryID;
	private String categoryName;
	private List<String> subCategory;
	
	
	public void setCategoryID(int categoryID)
	{
		this.categoryID = categoryID;
	}

	public int getCategoryID()
	{
		return categoryID;
	}
	
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}
	
	public String getCategoryName()
	{
		return categoryName;
	}
	
	public void setsubCategoryList(List<String> subCategory)
	{
		this.subCategory = subCategory;
	}
	
	public List<String> getsubCategory()
	{
		return subCategory;
	}
	
}
