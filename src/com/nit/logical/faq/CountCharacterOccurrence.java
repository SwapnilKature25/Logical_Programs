package com.nit.logical.faq;

// Count Occurrences of a Character
public class CountCharacterOccurrence {

	public static void main(String[] args) {
		String str = "banana";
		char target = 'a';
		int count = 0;

		char[] chars = str.toCharArray();
		// using foreach
		for (char ch : chars) {
			if (ch == target) {
				count++;
			}
		}
		
		// using for loop
//		char[] arr = str.toCharArray();
//		for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                count++;
//            }
//        }

		System.out.println("Occurrences of '" + target + "': " + count);
	}
}
