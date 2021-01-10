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
	private BigDecimal cartTotal;
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
		BigDecimal total = BigDecimal.ZERO;
		
		for(Map.Entry<Item, Integer> entry: cart.entrySet())
		{
			Item item = entry.getKey();
			int quantity = entry.getValue();
			BigDecimal multiplier = new BigDecimal(quantity);
			BigDecimal price = item.getPrice();
			BigDecimal lineTotal = price.multiply(multiplier);

			total = total.add(lineTotal);
		}
		return total;
	}
	public static BigDecimal getCurrentMoneyProvided() 
	{
		return currentMoneyProvided;
	}
	
	public PurchaseTransaction(BigDecimal cartTotal, BigDecimal currentMoneyProvided) {
	
		this.cartTotal = cartTotal;
		this.currentMoneyProvided = currentMoneyProvided;
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
