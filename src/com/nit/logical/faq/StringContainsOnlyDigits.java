package com.nit.logical.faq;

// Check if a String Contains Only Digits
public class StringContainsOnlyDigits {
	public static void main(String[] args) {
		String str="2315";
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
	        if (!Character.isDigit(str.charAt(i))) {
	            return false;
	        }
	    }
	    return true;
	}
}
