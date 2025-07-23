package com.nit.logical.faq;

import java.util.Arrays;

//Find Duplicate Characters in a String
public class DuplicateCharacters {

	public static void main(String[] args) {
		// 1. Using a Fixed-Size Frequency Array (ASCII)
		String str = "programming";
		int[] freq = new int[256]; // ASCII characters range (0–255)

		// Step 1: Count frequency of each character
		for (char ch : str.toCharArray()) {
            freq[ch]++;
            System.out.println("Processing '" + ch + "' (ASCII " + (int)ch + ") → Count: " + freq[ch]);
        }

		// Step 2: Print characters with frequency > 1
		System.out.println("Duplicate characters:");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1) {
				System.out.println((char) i + " → " + freq[i]);
			}
		}
	}

}

/* 
Processing 'p' (ASCII 112) ? Count: 1
Processing 'r' (ASCII 114) ? Count: 1
Processing 'o' (ASCII 111) ? Count: 1
Processing 'g' (ASCII 103) ? Count: 1
Processing 'r' (ASCII 114) ? Count: 2
Processing 'a' (ASCII 97) ? Count: 1
Processing 'm' (ASCII 109) ? Count: 1
Processing 'm' (ASCII 109) ? Count: 2
Processing 'i' (ASCII 105) ? Count: 1
Processing 'n' (ASCII 110) ? Count: 1
Processing 'g' (ASCII 103) ? Count: 2
Duplicate characters:
g ? 2
m ? 2
r ? 2


 */