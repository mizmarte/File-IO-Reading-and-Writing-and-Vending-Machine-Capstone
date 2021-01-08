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
		System.out.println("    Products");
		System.out.println("*****************");
		System.out.println();
	
//		loop through a map instead of an array list - shopping cart (view cart)
//		{

	Inventory.getInventory()
		
		
				for(Map.Entry<Item, Integer> row : items.entrySet())
		{
			items.put(Item, 5);
					//System.out.println(row.getKey().getName() + " : " + row.getKey().getId() + row.getValue());
		}
	}
}
