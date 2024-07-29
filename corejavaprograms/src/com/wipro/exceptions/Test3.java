package com.wipro.exceptions;

//called program
public class Test3 {
	
	//called function 
	public void division() throws ArithmeticException
	{
		int x =100/0;
		System.out.println("division is: " + x);
	}

}
