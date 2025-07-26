package com.nit.logical.faq;

// Compress a string (aaabb -> a3b2)
public class CompressStringCharacters {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(compress("aaabb"));    // Output: a3b2
        System.out.println(compress("aabbcc"));   // Output: a2b2c2
        System.out.println(compress("abc"));      // Output: a1b1c1
    }
}

