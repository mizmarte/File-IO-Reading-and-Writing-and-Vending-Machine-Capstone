package com.techelevator.models;

import java.util.HashMap;
import java.util.Map;

public class Inventory 
{
	
	private Map<Item, Integer> items = new HashMap<Item, Integer>();
	
	public Inventory()
	{
		loadInventory();
	}
	
	private void loadInventory()
	{
		FileProductLoader loader = new FileProductLoader();
		items = loader.loadInventory(); //not sure if this is correct
	}
	
	private Map<Item, Integer> getInventory()
	{
		return items;
	}
//add methods to address inventory mgmt once purchases are made
}
