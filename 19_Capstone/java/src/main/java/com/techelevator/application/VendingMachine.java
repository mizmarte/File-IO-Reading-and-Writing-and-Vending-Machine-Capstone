package com.techelevator.application;

import java.util.Scanner;

import com.techelevator.models.*;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
	private Inventory inventory = new Inventory();
	private static Scanner scanner = new Scanner(System.in);
//	private PurchaseTransaction purchaseTransaction = new PurchaseTransaction();
	
    public void run()
    {
        while(true)
        {
        	UserOutput.displayWelcomeScreen();
        
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
            	UserOutput.displayInventory(inventory);
            }
            else if(choice.equals("purchase"))
            {
            	String purchase = UserInput.getPurchaseOptions();
                // make a purchase
            	UserInput.getPurchaseOptions();
            	if (purchase.equals("feed"))
            	{
            		UserInput.getMoneyInput();
            		PurchaseTransaction.feedMoney();
            		PurchaseTransaction.getCurrentMoneyProvided();
            	}
            	else if (purchase.equals("select"))
            	{
            		UserOutput.displayInventory(inventory);
            		UserInput.getSelectedProduct();
            	}
            	else if (purchase.equals("finish"))
            	{
            		System.out.println("checkout");
            	}
            	
            }
            else if(choice.equals("quit"))
            {
                // good bye
                break;
            }
        } 
            while(true)
            {
                String purchase = UserInput.getPurchaseOptions();

                if(purchase.equals("Feed Money"))
                {
                    // display the vending machine slots
                	System.out.println("Insert Money");
//                	UserInput.getMoneyInput();
                	
                }
                else if(purchase.equals("Select product"))
                {
                    // make a purchase
                	System.out.println("Product");
                }
                else if(purchase.equals("exit"))
                {
                    // good bye
                    break;
                }
                
           
            }
            
    
    }  
    public void displayItems()
    {
    	//show the products
    }
}