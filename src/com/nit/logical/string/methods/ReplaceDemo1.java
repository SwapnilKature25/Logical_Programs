package com.nit.logical.string.methods;

public class ReplaceDemo1 {

	public static void main(String[] args) {
		String  str = "oaoaoa";
		String replace = str.replace('a', 'A');
		System.out.println("Original String : "+str);
		System.out.println("String after Replacement : "+replace);
		
		System.out.println("==============");
		
		String s1 = "Manager";
		System.out.println("Original String : "+s1);
		replace = s1.replace("Man", "Dam");
		System.out.println("String after Replacement : "+replace);
	}

}
