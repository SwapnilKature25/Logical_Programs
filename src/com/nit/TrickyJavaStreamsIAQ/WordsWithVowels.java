package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;

// Find the words with k vowels in a given sentence?
public class WordsWithVowels {

	public static void main(String[] args) {
		String sentence = "I have an applea and orange on the table";
		int k=3;  // the no. of vowels we want to find in each word
		
		Arrays.stream(sentence.split(" "))
			.filter(word -> countVowels(word)==k)
			.forEach(System.out::println);  // orange
	}
	
	public static long countVowels(String word) {
		return word.chars()
			.mapToObj(ch ->ch)  // convert back to character
			.filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
			.count(); 
	}
}
