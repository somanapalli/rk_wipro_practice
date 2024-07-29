package com.wipro.cfw;

import java.util.ArrayList;

public class Test6 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList();
		
		Student st1 = new Student(100,"kiran");
		Student st2 = new Student(101,"john");
		Student st3 = new Student(102,"pavan");
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		for(Student st:al)
		{
			System.out.println(st);
		}
		
		
	}

}
