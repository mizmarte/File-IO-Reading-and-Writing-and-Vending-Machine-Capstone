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
		public static String getSelectedProduct()
		{
			System.out.println();
			System.out.println("Which product do you want?");
			

			String itemId = scanner.nextLine();
			return itemId.trim();
		}
		
		public static String getPurchaseOptions()
		{
			System.out.println();
			System.out.println("Please select from the options below: ");
			
			System.out.println("1) Feed Money");
			System.out.println("2) Select product");
			System.out.println("3) Finish transaction");
			
			System.out.println();
			System.out.print("Please select a choice: ");
			
			String selectedPurchase = scanner.nextLine();
			String purchase = selectedPurchase.trim();
			

			if(purchase.equals("1"))
			{
				return "Feed Money";
			}
			else if(purchase.equals("2"))
			{
				return "Select product";
			}
			else if(purchase.equals("3"))
			{
				return "Finish transaction";
			}
			else
			{
				return "";
			}
			
		
		}
	public static BigDecimal getMoneyInput()
		
		{
			
			System.out.println("Please insert bills up to 10 dollars: ");
			
			BigDecimal moneyInserted = scanner.nextBigDecimal();
			
			return moneyInserted;
		}
		
			
			
		}

