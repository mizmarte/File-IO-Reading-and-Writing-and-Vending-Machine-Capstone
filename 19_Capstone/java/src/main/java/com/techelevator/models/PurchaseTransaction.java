package com.techelevator.models;

import com.techelevator.models.*;
import com.techelevator.ui.UserInput;
import com.techelevator.application.VendingMachine;
import com.techelevator.models.FileProductLoader;

import java.math.BigDecimal;

public class PurchaseTransaction 
{
	private BigDecimal cartTotal;
	private static BigDecimal currentMoneyProvided;
	
	public BigDecimal getCartTotal() 
	{
		return cartTotal;
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
