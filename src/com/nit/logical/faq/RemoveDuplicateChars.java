package com.nit.logical.faq;

import java.util.Arrays;
// Remove Duplicates from a String
public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// 1. Using Fixed-Size Boolean Array (ASCII)
		String str = "programming";
        boolean[] seen = new boolean[256];  // ASCII size   // by default seen is false
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println("String after removing duplicates: " + result.toString());
	
        System.out.println();
        
        // 2. Using Index-Based Loop on char array
        String st = "banana";
        char[] chars = str.toCharArray();
        boolean[] seens = new boolean[256];   // by default seen is false
        String results = "";

        for (int i = 0; i < chars.length; i++) {
            if (!seens[chars[i]]) {
                seens[chars[i]] = true;
                results += chars[i];  // simple concat (not memory efficient for large strings)
            }
        }
        System.out.println("After removing duplicates: " + results);
	}
}
/*
String after removing duplicates: progamin

After removing duplicates: progamin
*/