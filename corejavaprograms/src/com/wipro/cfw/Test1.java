package com.wipro.cfw;

import java.util.LinkedList;
import java.util.List;

public class Test1 {
	
	 public static void main(String[] args) {
		
		 
		 //create the object for List interface (ArrayList)
		 List l = new LinkedList();
		 
			/*
			 * l.add(Integer.valueOf(23)); 
			 * l.add(new String("rama"));
			 * l.add(Boolean.valueOf(true));
			 *  l.add(Character.valueOf('a')); 
			 *  l.add(null);
			 * l.add(Integer.valueOf(23));
			 */
		 
		 l.add(23);
		 l.add("rama");
		   l.add(true);
		 l.add('a');
		 l.add(null);
		 l.add(23);
		 
		 System.out.println(l);
		 System.out.println(l.get(2));
		 System.out.println(l.size());
		 System.out.println(l.contains("ram"));
		 System.out.println(l.indexOf(null));
		 System.out.println(l.isEmpty());
		 //l.clear();
		 //System.out.println(l.isEmpty());
		 //System.out.println(l.size());
		 //System.out.println(l);
		 
		
		 
		 for(Object o:l)
		 {
			 System.out.println(o);
		 }
		 
		 
		 
		 
		 
	}

}
