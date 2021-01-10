package com.techelevator.ui;

import java.util.HashMap;

import java.util.Map;

import com.techelevator.models.Inventory;
import com.techelevator.models.Item;

public class UserOutput 
{

	public static void displayInventory(Inventory inventory)
	{
		
		System.out.println();
		System.out.println("*****************");
		System.out.println("    Items");
		System.out.println("*****************");
		System.out.println();
	
//		loop through a map instead of an array list - shopping cart (view cart)
//		{

		
		Map<Item, Integer> items = inventory.getInventory();
	
		
		
				for(Map.Entry<Item, Integer> row : items.entrySet())
		{
			
					System.out.println(row.getKey().getId() + " : " + row.getKey().getName() + " : " + row.getKey().getPrice() + " : " + "Qty In Stock : " + row.getValue());
		}
	}
	
	public static void displayItemsToPurchase()
	{
		
	}
	
	public static void displayItemDispensed()
	{
		
	}
	
	public static void displayItemDispenseMessage()
	{
		
	}
	
}
