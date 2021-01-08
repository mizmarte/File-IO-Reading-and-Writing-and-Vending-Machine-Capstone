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
<<<<<<< HEAD

		
=======
		items = loader.loadInventory(); //not sure if this is correct
>>>>>>> efc100e484e3947875875c5eb41ea3caf6ae2cc3
	}
	
	private Map<Item, Integer> getInventory()
	{
		return items;
		
		
	}
//add methods to address inventory mgmt once purchases are made
}
