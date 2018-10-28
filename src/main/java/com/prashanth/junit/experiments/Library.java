package com.prashanth.junit.experiments;

import java.util.Random;

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

    int generateRandom() {
        return new Random().nextInt(4);
    }
}
