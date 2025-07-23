package com.nit.logical.faq;

// Count Vowels and Consonants
public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        str = str.toLowerCase(); // Make it case-insensitive

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        countVowelsAndConsonants(input);
    }
}
