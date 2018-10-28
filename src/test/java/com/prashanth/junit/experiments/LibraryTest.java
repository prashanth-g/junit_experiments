package com.prashanth.junit.experiments;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Testing Library class")
public class LibraryTest {

    @DisplayName("Testing someLibraryMethod \uD83E\uDD17")
    @Test 
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertEquals("Joe", classUnderTest.someLibraryMethod());
    }

    @DisplayName("Testing isPalindrome \uD83D\uDE4C")
    @ParameterizedTest
    @ValueSource(strings = {"Stats", "kayak", "Hanah"})
    void testPalindromes(String value){
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.isPalindrome(value));
    }

    @DisplayName("Testing generateRandom \uD83D\uDE4C")
    @RepeatedTest(5)
    void testGenerateRandom() {
        Library classUnderTest = new Library();
        assertNotEquals(classUnderTest.generateRandom(), 5);
    }
}
