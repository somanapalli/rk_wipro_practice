package com.wipro.exceptions;

import java.util.Scanner;

//execution logic class
public class Test7 {

	 public static void main(String[] args) {
		
		 Scanner s  = new Scanner(System.in);
		 
		 System.out.println("enter the product weight ");
		 int weight = s.nextInt();
		 
		 Test6 obj = new Test6();
		 
		 obj.checkProduct(weight);
		 
		 
	}
}
