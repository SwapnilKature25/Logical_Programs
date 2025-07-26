package com.nit.logical.faq;

// Remove all non-alphabetic characters from a string
public class RemoveNonAlphabeticCharacter {
    public static void main(String[] args) {
        String input = "He@llo! 123 W@or#ld";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result.append(ch);
            }
        }

        System.out.println("Cleaned String: " + result);
    }
}
 	