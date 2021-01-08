package com.techelevator.models;

import java.math.BigDecimal;

public class Gum extends Item
{
	public Gum(String id, String name, BigDecimal price) 
	{
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage()
	{
		
		
		return "Glug Glug, Yum!";
	
	
		
	}
}
