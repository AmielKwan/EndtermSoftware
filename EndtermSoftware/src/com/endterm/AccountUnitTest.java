package com.endterm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AccountUnitTest {

	@Test
	@DisplayName("Should test checking")
	void checking() 
	{
		Checking checking = new Checking(1);
		System.out.println(checking.getAccountInfo());
	}
	@Test
	@DisplayName("Should test savings")
	void savings() 
	{
		Savings savings = new Savings(2, 0.5);
		System.out.println(savings.getAccountInfo());
	}


}
