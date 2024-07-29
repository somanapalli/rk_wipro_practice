package com.wipro.cfw;

import java.util.TreeSet;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		//create the object for TreeSet
		
		TreeSet<Student> al = new TreeSet(new StudentIdComparator());
		
		
		Student st3 = new Student(500,"priyansh");
		Student st1 = new Student(100,"kiran");
		Student st2 = new Student(300,"vinayak");
		
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		for(Student o: al)
		{
			System.out.println(o);
			
		}
		
		
	}

}
