package com.wipro.cfw;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		//Student st1 = (Student)o1;
		//Student st2 = (Student)o2;
		
		/*
		 * if(st1.getStid()>st2.getStid()) { return -4; } else
		 * if(st1.getStid()<st2.getStid()) { return +4; } else { return 0; }
		 */
		
		return o2.getStid().compareTo(o1.getStid());
		
	}

	
	
}
