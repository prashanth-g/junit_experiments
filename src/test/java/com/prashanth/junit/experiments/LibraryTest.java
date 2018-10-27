package com.prashanth.junit.experiments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.prashanth.junit.experiments.Library;

@DisplayName("Testing Libaray class")
public class LibraryTest {

    @DisplayName("Testing someLibraryMethod")
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertEquals("Joe", classUnderTest.someLibraryMethod());
    }

    @DisplayName("Testing isPalindrome")
    @ParameterizedTest
    @ValueSource(strings = {"Stats", "kayak", "Hanah"})
    void testPalindromes(String value){
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.isPalindrome(value));
    }
}
