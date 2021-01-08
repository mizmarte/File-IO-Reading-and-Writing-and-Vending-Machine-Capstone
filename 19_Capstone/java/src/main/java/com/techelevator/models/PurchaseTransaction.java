package com.techelevator.models;

import java.math.BigDecimal;

public class PurchaseTransaction 
{
	private BigDecimal cartTotal;
	private BigDecimal currentMoneyProvided;
	
	public BigDecimal getCartTotal() {
		return cartTotal;
	}
	public BigDecimal getCurrentMoneyProvided() {
		return currentMoneyProvided;
	}
	
	public PurchaseTransaction(BigDecimal cartTotal, BigDecimal currentMoneyProvided) {
	
		this.cartTotal = cartTotal;
		this.currentMoneyProvided = currentMoneyProvided;
	}
	
	public BigDecimal feedMoney()
	{
		

		BigDecimal moneyInserted = new BigDecimal(0);
		currentMoneyProvided = currentMoneyProvided.add(moneyInserted);
		return currentMoneyProvided;
	}
	
	
	
}