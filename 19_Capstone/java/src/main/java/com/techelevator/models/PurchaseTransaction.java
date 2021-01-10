package com.techelevator.models;

import com.techelevator.models.*;
import com.techelevator.ui.UserInput;
import com.techelevator.application.VendingMachine;
import com.techelevator.models.FileProductLoader;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PurchaseTransaction 
{
	private static BigDecimal currentMoneyProvided;
	Map<Item, Integer> cart = new HashMap<Item, Integer>();
	
	public void add(Item item)
	{
		// add product or update quantity
		if(cart.containsKey(item))
		{
			// update the quantity
			int quantity = cart.get(item);
			quantity++;
			cart.put(item, quantity);
		}
		else
		{
			// not in cart - so just add it
			cart.put(item, 1);
		}
	}
	
	public BigDecimal getCartTotal() 
	{
		BigDecimal cartTotal = BigDecimal.ZERO;
		
		for(Map.Entry<Item, Integer> entry: cart.entrySet())
		{
			Item item = entry.getKey();
			int quantity = entry.getValue();
			BigDecimal multiplier = new BigDecimal(quantity);
			BigDecimal price = item.getPrice();
			BigDecimal lineTotal = price.multiply(multiplier);

			cartTotal = cartTotal.add(lineTotal);
		}
		return cartTotal;
	}
	public static BigDecimal getCurrentMoneyProvided() 
	{
		return currentMoneyProvided;
	}
	
	public PurchaseTransaction(BigDecimal cartTotal, BigDecimal currentMoneyProvided) 
	{
		if (cartTotal.compareTo(currentMoneyProvided) > 0)
		{
			System.out.println("You do not have enough money to complete this transaction");
			System.out.println("Please enter more money");
		}
		BigDecimal change = currentMoneyProvided.subtract(cartTotal);
		
		//return change;
	}
	
	public static BigDecimal feedMoney()
	{

		BigDecimal moneyInserted = new BigDecimal(0);
		currentMoneyProvided = currentMoneyProvided.add(moneyInserted);
		BigDecimal moreBones = new BigDecimal(0);
		
		
		if (moreBones.compareTo(BigDecimal.ZERO) > 0)
		{
			currentMoneyProvided.add(moneyInserted);
		}
		return currentMoneyProvided;
	}
	
	
	
	
	
	
	
	
}
