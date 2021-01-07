package com.techelevator.application;

import com.techelevator.ui.UserInput;

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
            	System.out.println("displaying items");
            }
            else if(choice.equals("purchase"))
            {
                // make a purchase
            }
            else if(choice.equals("exit"))
            {
                // good bye
                break;
            }
        }
    }
    
}
