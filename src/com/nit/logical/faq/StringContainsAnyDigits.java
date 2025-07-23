package com.nit.logical.faq;

// Check if a String Contains Any Digits
public class StringContainsAnyDigits {

	public static void main(String[] args) {
		String str="AD25D";
		if(containsOnlyDigits(str)) {
			System.out.println("Contains digits ");			
		}
		else {
			System.out.println("Not Contains digits ");						
		}
	}
	
	public static boolean containsOnlyDigits(String str) {
	    if (str == null || str.isEmpty()) return false;

	    for (int i = 0; i < str.length(); i++) {
	        if (Character.isDigit(str.charAt(i))) {
	            return true;
	        }
	    }
	    return false;
	}

}
