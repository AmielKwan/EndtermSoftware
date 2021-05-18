package com.endterm;

public abstract class Account 
{
	protected int accountNum;
	protected double balance;
	
	public Account (int accountNum)
	{
		this.accountNum = accountNum;
		this.setBalance(0.0);
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public abstract int getAccnNumber();
	public abstract double getBalance();
	protected abstract String getAccountInfo();
	
}
