package com.techelevator.ui;

import java.math.BigDecimal;
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
		
	public static String getPurchaseOptions()
	{
		System.out.println();
		System.out.println("Please select from the options below: ");
		
		System.out.println("1) Feed Money");
		System.out.println("2) Select product");
		System.out.println("3) Finish transaction");
		
		System.out.println();
		//System.out.println("Total amount entered: " + <need balance variable>);
		System.out.println();
		System.out.print("Please select a choice: ");
		
		String selectedChoice = scanner.nextLine();
		String choice = selectedChoice.trim();
		

		if(choice.equals("1"))
		{
			return "Feed Money";
		}
		else if(choice.equals("2"))
		{
			return "Select product";
		}
		else if(choice.equals("3"))
		{
			return "Finish transaction";
		}
		else
		{
			return "";
		}
	}
	
	public static String getSelectedProduct()
	{
		System.out.println();
		System.out.println("Please select the item id");
		

		String itemId = scanner.nextLine();
		return itemId.toUpperCase().trim();
	}
	
	
	public static BigDecimal getMoneyInput()
		
		{
		//under user input - "adding more money?" String variable moredough(boolean finished adding money)
		//if moredough equals yes return to beginning of feed money function
		//if no display current money provided and prompt user to enter selectionfor purchase "please press 2 to select product"
		//, no prompt them to add more
			
			System.out.println("Please insert a bill up to 10 dollars ($1, $2, 5$, or $10 bills only): ");
			String moneyIn = scanner.nextLine().trim();
			BigDecimal moneyInserted = new BigDecimal(moneyIn);
			System.out.println(moneyInserted);
			
			System.out.println("Adding more money? (yes) or (no)");
			String moreDough = scanner.nextLine().trim();
			BigDecimal moreBones = new BigDecimal(0);
			if (moreDough == "yes")
			{
				System.out.println("Insert additional money");
				moreBones = scanner.nextBigDecimal();
				moneyInserted.add(moreBones);
			}
			else if(moreDough == "no")
			{
				System.out.println("$" + moneyInserted);
			
			}
			 return moneyInserted;
			
			
		}
		
			
			
		}

