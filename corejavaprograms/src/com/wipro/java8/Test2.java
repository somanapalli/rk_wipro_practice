package com.wipro.java8;

import java.util.TreeSet;



public class Test2 {

	
	public static void main(String[] args) {
		//int compare(T o1, T o2);
		TreeSet<Student> ts = new TreeSet<Student>((x,y)-> y.getStname().compareTo(x.getStname()));
		
		Student st1 = new Student(101,"kiran");
		Student st2 = new Student(78,"rizwana");
		
		Student st3 = new Student(74,"aman");
		
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		
		System.out.println(ts);
		
		
	}
}
