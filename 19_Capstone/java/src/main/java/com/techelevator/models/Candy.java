package com.techelevator.models;

import java.math.BigDecimal;

public class Candy extends Item
{
	public Candy(String name, BigDecimal price) 
	{
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage()
	{
		
		
		return "Munch Munch, Yum!";
	
	
		
	}

}
