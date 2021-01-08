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
	
//		for(Item item: inventory.getItems()) - how to loop through a map instead of an array list - shopping cart (view cart)
//		{

//	for(Map.Entry<Item, Integer> row : items.entrySet())
//		{
//			System.out.println(row.getKey() + " : " + row.getValue());
//		}
		
//		Map<Item, Integer> items = new HashMap<Item, Integer>();
		
//		public void add(Item item)
//		{
//			// add product or update quantity

//		}
	}
}
