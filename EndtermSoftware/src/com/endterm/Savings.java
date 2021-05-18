package com.endterm;

public class Savings extends Account 
{
	private double Interest;
	public Savings(int accountNum, double Interest) 
	{
		super(accountNum);
		setInterest(Interest);

		// TODO Auto-generated constructor stub
	}

	private void setInterest(double Interest) 
	{
		this.Interest = Interest;
		// TODO Auto-generated method stub

	}

	@Override
	public int getAccnNumber() {
		// TODO Auto-generated method stub
		return accountNum;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public String getAccountInfo()
	{
		return("Savings Account Information\nAccount Number: " + getAccnNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}

	private double getInterestRate() {
		// TODO Auto-generated method stub
		return this.Interest;
	}
}
