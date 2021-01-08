package com.techelevator.models;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class FileProductLoader

{
	private Map<Item, Integer> items = new HashMap<Item, Integer>();
	
	public Map<Item, Integer> loadInventory()

	
	{
		File itemPath = new File("vendingmachine.csv.");	
		
		try
		{
			Scanner fileScanner = new Scanner(itemPath);
			// read one line to skip the header
			
			
			//loop and add each product to the list
			while(fileScanner.hasNextLine())
			{
				Item item = null;
				String line = fileScanner.nextLine();
				// create the product
				String[] parts = line.split("\\|");
				
				String id = parts[0];
				String name = parts[1];
				String price = parts[2];
				String type = parts[3];
				
//				item = new Item(id, name, price, type);
								
				// add it to the list
			
				
				if(type.equals("Chip"))
				{
					item = new Chip(id,name, new BigDecimal(price));
				}
				else if(type.equals("Candy"))
				{
					item = new Candy(id,name, new BigDecimal(price));
				}
				else if(type.equals("Drink"))
				{
					item = new Drink(id,name, new BigDecimal(price));
				}
				else if(type.equals("Gum"))
				{
					item = new Gum(id,name, new BigDecimal(price));
				}
				
				items.put(item, 5);
			}
		}
		
		catch(Exception e)
		{
			
		}
		
		
		return items;
	}
    
}

		
