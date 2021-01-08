package com.techelevator.models;

import java.math.BigDecimal;

public class Chip extends Item

{
	public Chip(String name, BigDecimal price) 
	{
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage()
	{
		
		
		return "Crunch Crunch, Yum!";
	
	
		
	}

}
