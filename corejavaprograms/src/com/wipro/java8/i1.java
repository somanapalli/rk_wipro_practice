package com.wipro.java8;

public interface i1 {

	//default method
	 default void m1()
	{
		System.out.println("default method");
	}
	
	//static method
	static void m2()
	{
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		i1.m2();
		
		
		
		
	}
}
