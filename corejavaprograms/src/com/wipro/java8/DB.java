package com.wipro.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DB {

	public static List<Customer> getAll() {

		return Stream.of(

				new Customer(101, "john", "john@gmail.com", Arrays.asList("987679", "876567")),
				new Customer(102, "doe", "doe@gmail.com", Arrays.asList("675678", "123456")),
				new Customer(103, "smith", "smith@gmail.com", Arrays.asList("123456", "678901"))).collect(Collectors.toList());

	}
}
