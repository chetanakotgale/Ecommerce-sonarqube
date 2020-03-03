package entity;

import java.util.List;

public class SubCategoryEntity
{

	private int subCategoryID;
	private String subCategoryName;
	private List<String> product;
	
	public void setSubCategoryID(int subCategoryID)
	{
		this.subCategoryID = subCategoryID;
	}

	public int getSubCategoryID()
	{
		return subCategoryID;
	}
	
	public void setSubCategoryName(String subCategoryName)
	{
		this.subCategoryName = subCategoryName;
	}
	
	public String getSubCategoryName()
	{
		return subCategoryName;
	}
	
	public void setProductList(List<String> product)
	{
		this.product = product;
	}
	
	public List<String> getProduct()
	{
		return product;
	}
}
