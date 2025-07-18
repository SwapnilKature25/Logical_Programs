package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;

// Given a list of strings, find out those strings which start with a number?
public class StringsStartingWithNumber {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("5apple","banana","3avocado","1bluberry","custardapple");

		fruits.stream()
				.filter( str -> !str.isEmpty() && Character.isDigit(str.charAt(0)))
				.forEach(System.out::println);
	}
}

/*
5apple
3avocado
1bluberry

*/