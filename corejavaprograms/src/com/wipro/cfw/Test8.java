package com.wipro.cfw;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test8 {

	
	public static void main(String[] args) {
		
		//create the object for SortedMap
		
		SortedMap<Student,Integer> sm = new TreeMap(new StudentIdComparator());
		
		sm.put(new Student(1,"rk"), 100);
		sm.put(new Student(-3,"smith"),34);
		sm.put(new Student(22,"john"), 12);
		
		System.out.println(sm);
		
	}
}
