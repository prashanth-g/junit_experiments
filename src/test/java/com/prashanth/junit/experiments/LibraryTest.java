package com.prashanth.junit.experiments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.prashanth.junit.experiments.Library;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertEquals("Joe", classUnderTest.someLibraryMethod());
    }
}
