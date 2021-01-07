package com.techelevator.models;

import java.math.BigDecimal;

public abstract class Item 
{
	 private String id;
	 private String name;
	 private BigDecimal price;
	
public Item(String id, String name, BigDecimal price) 
	 {
		this.id = id;
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

public abstract String getMessage();

	@Override
	public String toString()
	{
		   return id + ")" + name + ": $" + price;
	}



	 
}
