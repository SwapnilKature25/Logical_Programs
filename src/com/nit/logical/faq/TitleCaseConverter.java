package com.nit.logical.faq;

// Java Program: Convert String to Title Case Using Array
public class TitleCaseConverter {

    public static String toTitleCase(String input) {
        char[] chars = input.toLowerCase().toCharArray(); // Step 1: Convert all to lowercase

        boolean foundSpace = true;

        for (int i = 0; i < chars.length; i++) {
            // If current char is a letter and previous was space, capitalize it
            if (Character.isLetter(chars[i])) {
                if (foundSpace) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true; // Next letter after space should be capital
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String sentence = "welcome TO java programming";
        String titleCase = toTitleCase(sentence);
        System.out.println("Original: " + sentence);
        System.out.println("Title Case: " + titleCase);
    }
    /*
	Original: welcome TO java programming
	Title Case: Welcome To Java Programming
	*/
}
