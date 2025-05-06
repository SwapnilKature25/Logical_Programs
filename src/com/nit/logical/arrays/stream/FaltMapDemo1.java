package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FaltMapDemo1 {
	public static void main(String[] args) {
		List<String> ind=Arrays.asList("Rohit","Virat","Bumrah");
		List<String> aus=Arrays.asList("Pat","Head","Klassen");
		
		List<List<String>> teams = Arrays.asList(ind,aus);
		System.out.println(teams);
		
		List<String> collect = teams.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(collect);
	
	}
}
