package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find the word with third highest length
public class ThirdLongestWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry");
		
		words.stream()
				.sorted((w1,w2)-> Integer.compare(w2.length(), w1.length()))
				.skip(2).findFirst().ifPresent(System.out::println);
	}
}
