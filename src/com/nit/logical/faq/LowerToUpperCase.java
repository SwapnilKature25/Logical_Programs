package com.nit.logical.faq;

// Convert lowercase to uppercase without toUpperCase()
public class LowerToUpperCase {
    public static void main(String[] args) {
        String input = "hello java";
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
        }

        System.out.println("Uppercase: " + new String(chars));
    }
}
