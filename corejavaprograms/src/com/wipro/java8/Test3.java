package com.wipro.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test3 {
	
	public static void main(String[] args) {
		
	List<String> al =  Arrays.asList("welcome","to","kiran","swathi","ankit","priyansh","priyanka");
		
	List<String> filterdNames = al.stream().filter(x -> x.startsWith("p")).collect(Collectors.toList());
	
	System.out.println(filterdNames);
	// R apply(T t);
	
	List<String> upperCaseNames = al.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	System.out.println(upperCaseNames);
	
	
	List<String> sortedNames = al.stream().sorted().collect(Collectors.toList());
	
	System.out.println(sortedNames);
	
	//int compare(T o1, T o2);

	List<String> sortedNamesDescending=al.stream().sorted( (x,y)->y.compareTo(x)).collect(Collectors.toList());
	
	System.out.println(sortedNamesDescending);
	
	// void accept(T t)
	al.stream().sorted( (x,y)->y.compareTo(x)).forEach(x -> System.out.println(x));
	
	
	List<Integer> numbers = Arrays.asList(3,9,2,8,1,4,4,3);
	
	Optional<Integer> min = numbers.stream().min((x,y) -> x.compareTo(y));
	
	min.ifPresent(value -> System.out.println("the minimum value is: " + value));
	
	
	numbers.stream().max(Comparator.naturalOrder()).ifPresent(x->System.out.println("the maximum value is : " + x));
    
	//R apply(T t, U u);
	
	numbers.stream().reduce( (x,y) -> x+y ).ifPresent(x -> System.out.println("Total sum is: " + x));
	
	System.out.println("the sum is: " + numbers.stream().reduce(0, (x,y)->x+y));
	
	
	System.out.println("original list:" + numbers);
	
	List<Integer> distinctIntegersList = numbers.stream().distinct().collect(Collectors.toList());
		
	
	System.out.println("distinct list:" + distinctIntegersList);
	
	
	Map<String,Integer> ageMap = new LinkedHashMap<>();
	
	ageMap.put("philip", 37);
	ageMap.put("rk", 35);
	ageMap.put("sameera", 25);
	ageMap.put("kushvanth", 65);
	
	List<Integer> doubleValues = ageMap.values().stream().map(x -> x*2).collect(Collectors.toList());
	
	
	System.out.println(doubleValues);
	
	
	List<Customer> customers = DB.getAll();
	
	List<String> emails = customers.stream().map(x -> x.getEmail()).collect(Collectors.toList());
	
	System.out.println(emails);
	
	
	List<List<String>> phoneNumbers = customers.stream().map(x -> x.getPhoneNumbers()).collect(Collectors.toList());
	System.out.println(phoneNumbers);
	
	List<String> phones = customers.stream().flatMap(x -> x.getPhoneNumbers().stream()).collect(Collectors.toList());
	System.out.println(phones);
	}

}
