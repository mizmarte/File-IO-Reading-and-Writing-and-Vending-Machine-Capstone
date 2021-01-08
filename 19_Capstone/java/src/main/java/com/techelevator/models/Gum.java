package com.techelevator.models;

import java.math.BigDecimal;

public class Gum extends Item
{
	public Gum(String name, BigDecimal price) 
	{
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage()
	{
		
		
		return "Glug Glug, Yum!";
	
	
		
	}
}
