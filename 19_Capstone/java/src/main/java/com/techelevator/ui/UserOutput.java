package com.techelevator.ui;

import java.util.HashMap;

import java.util.Map;

import com.techelevator.models.Inventory;
import com.techelevator.models.Item;

public class UserOutput 
{

	public static void clearScreen() 
	{  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}
	
	public static void displayWelcomeScreen() 
	{
		clearScreen();
		
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("            WELCOME TO OUR VENDING MACHINE");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
	}
	
	
	
	public static void displayInventory(Inventory inventory)
	{
		
		clearScreen();
		
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("                        Items");
		System.out.println("******************************************************");
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
