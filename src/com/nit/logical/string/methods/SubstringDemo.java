package com.nit.logical.string.methods;

public class SubstringDemo {
	public static void main(String[] args) {
		String str = "Hyderabad";
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(3,7));
		System.out.println(str.substring(3,3)); // nothing will print
//		System.out.println(str.substring(7,5));
	   // java.lang.StringIndexOutOfBoundsException: Range [7, 5) out of bounds for length 9

//		System.out.println(str.substring(0,-2));
		//java.lang.StringIndexOutOfBoundsException: Range [0, -2) out of bounds for length 9
	
		System.out.println(str.substring(2,2));
		//java.lang.StringIndexOutOfBoundsException: Range [-2, 2) out of bounds for length 9
	}
}
