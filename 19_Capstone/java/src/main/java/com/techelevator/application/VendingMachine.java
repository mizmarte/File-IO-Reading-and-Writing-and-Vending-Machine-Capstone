package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
    public void run()
    {
        while(true)
        {
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
         //   	UserOutput.displayInventory(inventory);
            }
            else if(choice.equals("purchase"))
            {
                // make a purchase
            	System.out.println("Things to buy");
            }
            else if(choice.equals("exit"))
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