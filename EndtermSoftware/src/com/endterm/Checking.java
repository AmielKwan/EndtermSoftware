package com.endterm;

public class Checking extends Account
{

	public Checking(int accountNum) {
		super(accountNum);
		// TODO Auto-generated constructor stub
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
		return("Checking Account Information:\nAccount Number: " + getAccnNumber() + "\nBalance: " + getBalance());
	}
}
