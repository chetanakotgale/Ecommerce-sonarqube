package entity;

public class CartEntity 
{
	private int cartID;
	private String cartName;
	private int cartQuantity;
	private Long cartPrice;
	private int cartProductID;
	
	public void setCartID(int cartID)
	{
		this.cartID = cartID;
	}
	
	public int getCartID()
	{
		return cartID;
	}

	public void setCartName(String cartName)
	{
		this.cartName = cartName;
	}
	
	public String getCartName()
	{
		return cartName;
	}
	
	public void setCartQuantity(int cartQuantity)
	{
		this.cartQuantity = cartQuantity;
	}
	
	public int getCartQuantity()
	{
		return cartQuantity;
	}

	public void setCartPrice(Long cartPrice)
	{
		this.cartPrice = cartPrice;
	}
	
	public Long getCartPrice()
	{
		return cartPrice;
	}

	public void setCartProductID(int cartProductID)
	{
		this.cartProductID = cartProductID;
	}
	
	public int getCartProductID()
	{
		return cartProductID;
	}
}
