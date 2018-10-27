package com.prashanth.junit.experiments;

public class Library {
    public String someLibraryMethod() {
        return "Joe";
    }

    boolean isPalindrome(String value) {
        String reverseString = "";
        for (int i = value.length() - 1; i >= 0; i-- ) {
            reverseString = reverseString + value.charAt(i);
        }

        if(reverseString.equalsIgnoreCase(value)) {
            return true;
        }
        return false;
    }
}
