package com.nit.logical.faq;

// Convert string to integer without Integer.parseInt()		
public class StringToInt {
    public static int convertToInt(String str) {
        int result = 0;
        boolean isNegative = false;
        int i = 0;

        if (str.charAt(0) == '-') {
            isNegative = true;
            i = 1; // Start from next char
        }

        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new NumberFormatException("Invalid character in input");
            }

            int digit = ch - '0';  // Convert char to number // 49-48=1, 50-48=2,..
            result = result * 10 + digit;  // 1, 1*10+2=12,....
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(convertToInt("1234"));   // 1234
        System.out.println(convertToInt("-567"));   // -567
    }
}
