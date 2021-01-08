package com.techelevator.models;

import java.math.BigDecimal;

public class Chip extends Item

{
	public Chip(String id, String name, BigDecimal price) 
	{
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage()
	{
		
		
		return "Crunch Crunch, Yum!";
	
	
		
	}

}
