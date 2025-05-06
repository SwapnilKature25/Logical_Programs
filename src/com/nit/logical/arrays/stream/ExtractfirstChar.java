package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class ExtractfirstChar {

	public static void main(String[] args) {
		String []players= {"Rohit","Kohli","Virat","Sharma"};
		
		Object[] array = Arrays.stream(players).map(str -> str.charAt(0)).toArray();
		System.out.println(Arrays.toString(array));
		
		
	}

}
