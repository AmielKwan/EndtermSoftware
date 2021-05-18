package com.endterm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AccountUnitTest {

	private int value = 0;

	//	@Test
	//	@DisplayName("Should test checking")
	//	void checking() 
	//	{
	//		Checking checking = new Checking(1);
	//		System.out.println(checking.getAccountInfo());
	//	}
	//	@Test
	//	@DisplayName("Should test savings")
	//	void savings() 
	//	{
	//		Savings savings = new Savings(2, 0.5);
	//		System.out.println(savings.getAccountInfo());
	//	}
//	@Test
//	@DisplayName("Should display a mix array of 10")
//	void AccountArray()
//	{
//		Account[] accountArray = new Account[10];
//
//		accountArray[0] = new Checking(1);
//		accountArray[1] = new Checking(3);
//		accountArray[2] = new Checking(5);
//		accountArray[3] = new Checking(7);
//		accountArray[4] = new Checking(9);
//		accountArray[5] = new Savings(2, 0.5);
//		accountArray[6] = new Savings(4, 1.0);
//		accountArray[7] = new Savings(6, 1.5);
//		accountArray[8] = new Savings(8, 2.0);
//		accountArray[9] = new Savings(10, 2.5);
//
//		for(int i = 0; i < accountArray.length; ++i)
//		{
//			System.out.println(accountArray[i].getAccountInfo() + "\n");
//		}
//		assertEquals(accountArray.length, 10);
//	}
	@Test
	@DisplayName("Interface deposit")
	void deposit()
	{
		Checking checking = new Checking (this.value);
		System.out.println(this.value);
	}


}
