package com.techelevator.models;

import java.util.HashMap;
import java.util.Map;

public class Inventory 
{
	
	private Map<Item, Integer> items = new HashMap<Item, Integer>();
	
	public Map<Item, Integer> getInventory()
	{
		return items;
			
	}
	//is a constructor needed for this class
	//load inventory is a method of the inventory
	
//	public Map loadInventory()
//	{
//		
//	}
//	
	private void loadInventory()
	{
		FileProductLoader loader = new FileProductLoader();

		items = loader.loadInventory(); //not sure if this is correct

	}
	
	
//add methods to address inventory mgmt once purchases are made
}
