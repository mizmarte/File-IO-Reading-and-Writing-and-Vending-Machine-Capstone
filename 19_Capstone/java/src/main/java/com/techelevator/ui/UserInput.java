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
			return "feed";
		}
		else if(choice.equals("2"))
		{
			return "select";
		}
		else if(choice.equals("3"))
		{
			return "finish";
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
		
			UserOutput.clearScreen();
			
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			System.out.println("                      FEED ME MONEY!!!");
			System.out.println("********************************************************");
			System.out.println("********************************************************");
			
			System.out.println("Please insert a bill up to 10 dollars ($1, $2, 5$, or $10 bills only): ");
			String moneyIn = scanner.nextLine().trim();
			BigDecimal moneyInserted = new BigDecimal(moneyIn);
			System.out.println(moneyInserted);
			
			System.out.println("Adding more money? (yes) or (no)");
			String moreDoughAnswer = scanner.nextLine().trim();
			BigDecimal moreBones = new BigDecimal(0);
			
			{
				if (moreDoughAnswer.equals("yes"))
				System.out.println("Insert additional money");
				String addBones = scanner.nextLine().trim();
				moreBones = new BigDecimal(addBones);
				moneyInserted.add(moreBones);
			}
				if(moreDoughAnswer.equals("no"))
			{
				System.out.println("$" + moneyInserted);
			
			}
			 return moneyInserted;
		 
			 
			
			
		}
		
			
			
		}

