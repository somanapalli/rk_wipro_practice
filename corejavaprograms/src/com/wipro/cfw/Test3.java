package com.wipro.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test3 {
	
	public static void main(String[] args) {
		
		//create the objecct for TreeSet
		
		SortedSet s = new TreeSet();
		s.add(34);
		s.add(8);
		s.add(-9);
		s.add(897);
		s.add(450);
		//s.add(null);
		//s.add("rama");
		s.add(34);
		
		
		
		
		for(Object o : s)
		{
			System.out.println(o);
		}
		
	}

}
