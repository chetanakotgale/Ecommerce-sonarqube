package entity;

public class ProductEntity 
{

	private int productID;
	private String productName;
	private int productQuantity;
	private Long productPrice;
	
	public void setProductID(int productID)
	{
		this.productID = productID;
	}
	
	public int getProductID()
	{
		return productID;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductQuantity(int productQuantity)
	{
		this.productQuantity = productQuantity;
	}
	
	public int getProductQuantity()
	{
		return productQuantity;
	}

	public void setProductPrice(Long productPrice)
	{
		this.productPrice = productPrice;
	}
	
	public Long getProductPrice()
	{
		return productPrice;
	}
}
