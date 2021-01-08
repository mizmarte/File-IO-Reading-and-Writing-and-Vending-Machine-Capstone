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
	public Inventory()
	{
		loadInventory();
	}
	//is a constructor needed for this class
	
//	
	private void loadInventory()
	{
		FileProductLoader loader = new FileProductLoader();

		items = loader.loadInventory(); //not sure if this is correct

	}
	
	
//add methods to address inventory mgmt once purchases are made
}
