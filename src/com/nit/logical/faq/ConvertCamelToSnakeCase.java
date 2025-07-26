package com.nit.logical.faq;

// Convert CamelCase to snake_case
public class ConvertCamelToSnakeCase {
    public static String toSnakeCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append('_').append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "convertCamelCaseToSnakeCase";
        System.out.println("snake_case: " + toSnakeCase(input));  // snake_case: convert_camel_case_to_snake_case

    }
}

