package com.techelevator.ui;

import java.util.Scanner;
/**
 * Responsibilities:
 *      This class should handle receiving ALL input from the User
 * 
 * Dependencies:
 *      None
 */
public class UserInput 
{
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getHomeScreenOption()
	{
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();

		System.out.println("1) View available items");
		System.out.println("2) Make a purchase");
		System.out.println("3) quit");
		
		System.out.println();
		System.out.print("Please select a choice: ");
		
		String selectedChoice = scanner.nextLine();
		String choice = selectedChoice.trim();
		
		if(choice.equals("1"))
		{
			return "display";
		}
		else if(choice.equals("2"))
		{
			return "purchase";
		}
		else if(choice.equals("3"))
		{
			return "exit";
		}
		else
		{
			return "";
		}
		
	}
	
}
