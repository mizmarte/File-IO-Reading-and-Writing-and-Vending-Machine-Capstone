package com.techelevator.models;

import java.math.BigDecimal;

public abstract class Item 
{
	 private String id;
	 private String name;
	 private BigDecimal price;
	 private String type;
	
public Item(String name, BigDecimal price) 
	 {
		this.name = name;
		this.price = price;
		
	 }

public String getId()
{
	return id;
}

public String getName() 
{
	return name;
}

public BigDecimal getPrice() 
{
	return price;
}

public String getType()
{
	return type;
}

public abstract String getMessage();

	@Override
	public String toString()
	{
		   return id + ")" + name + ": $" + price;
	}



	 
}
