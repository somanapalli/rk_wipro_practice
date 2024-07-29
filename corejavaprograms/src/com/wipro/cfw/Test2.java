package com.wipro.cfw;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args) {
		
		//creating the object for Set interface
		
		
		Set s = new LinkedHashSet();//CTRL + SHIFT + O
		
	s.add(23);
	s.add(23);
	s.add(true);
	s.add("rama");
	s.add(null);
	s.add(null);
	
	 for(Object o: s)
	 {
		 System.out.println(o);
	 }
		
	}

}
