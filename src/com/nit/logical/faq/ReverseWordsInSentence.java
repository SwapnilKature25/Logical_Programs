package com.nit.logical.faq;

import java.util.Arrays;

// Reverse words in a sentence
public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [Java, is, powerful]

        // Reverse the words array
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) System.out.print(" ");   // powerful is Java
        }
    }
}
