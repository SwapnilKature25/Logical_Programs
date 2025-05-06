package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class LengthUsingMap {

	public static void main(String[] args) {
		String []players= {"Rohit","Virat","Bumrah"};
		
		Object[] array = Arrays.stream(players).map(String::length).toArray();
		System.out.println(Arrays.toString(array));

	
	}

}
