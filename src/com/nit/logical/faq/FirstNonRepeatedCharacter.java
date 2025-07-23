package com.nit.logical.faq;

// Find First Non-Repeated Character
public class FirstNonRepeatedCharacter {
	 public static Character firstNonRepeatedChar(String str) {
	        int[] freq = new int[26];

	        // 1st Pass: Count frequency
	        for (int i = 0; i < str.length(); i++) {
	            freq[str.charAt(i) - 'a']++;
	        }

	        // 2nd Pass: Find first character with freq == 1
	        for (int i = 0; i < str.length(); i++) {
	            if (freq[str.charAt(i) - 'a'] == 1) {
	                return str.charAt(i);
	            }
	        }

	        return null; // No non-repeating char found
	    }

	    public static void main(String[] args) {
	        String str = "swiss";
	        Character result = firstNonRepeatedChar(str);

	        if (result != null)
	            System.out.println("First non-repeated character: " + result);
	        else
	            System.out.println("No non-repeated character found.");
	    }
}

