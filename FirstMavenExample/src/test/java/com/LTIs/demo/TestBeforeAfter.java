package com.LTIs.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class TestBeforeAfter {
	@BeforeAll
	public static void dbConn()
	{
	Assertions.assertEquals("Up","Up");
	System.out.println(" before All");
	System.out.println(" before All");
	}

	@BeforeEach
	public void testSum()
	{
	Assertions.assertEquals("Up","Up");
	System.out.println(" before each ");
	}

	@Test
	public  void testAdd() {
		Calculator c=new Calculator();
		Assertions.assertEquals(500, c.add(300,200));
	}
	@Test
	public void testCase1() {
		                       //expected  //Actual
		Assertions.assertEquals("Hello", "Hello");
		
	}
	@AfterEach
	public void testSumZero()
	{

	System.out.println(" After Each ");
	}


	@AfterAll
	public static  void testDbClosed()
	{
	System.out.println("db connection closed ");
	System.out.println(" After All - db conn closed ");
	}

}
