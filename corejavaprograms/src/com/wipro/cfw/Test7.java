package com.wipro.cfw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test7 {
	
	public static void main(String[] args) {
		
		
		//create an object for Map interface
		
		Map<Integer,Student> m = new HashMap();
		
		
		m.put(56, new Student(78,"john"));
		m.put(1, new Student(100,"ram"));
		m.put(23, new Student(45,"williams"));
		m.put(2, new Student(101,"smith"));
		
		
		System.out.println(m);
		
		
		
		
		
	}

}
