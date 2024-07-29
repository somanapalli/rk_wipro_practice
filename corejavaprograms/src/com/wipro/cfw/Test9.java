package com.wipro.cfw;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test9 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		
		ListIterator<Integer> ltr = al.listIterator();
		
		System.out.println("retrieving the elements in forward direction");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("retreiving the elements in backward direction ");
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
			
			
		}
		
	}

}
