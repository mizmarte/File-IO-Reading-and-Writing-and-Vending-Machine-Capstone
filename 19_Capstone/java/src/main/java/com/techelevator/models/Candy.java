package com.techelevator.models;

import java.math.BigDecimal;

public class Candy extends Item
{
	public Candy(String id, String name, BigDecimal price) 
	{
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage()
	{
		
		
		return "Munch Munch, Yum!";
	
	
		
	}

}
