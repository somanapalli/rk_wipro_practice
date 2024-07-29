package com.wipro.exceptions;
//calling program
public class Test4 {
	
	//calling function 
	public static void main(String[] args) {
		
		Test3 obj = new Test3();
		
		try
		{
			obj.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("something problem in division method, check it once");
		}
		
	}

}
