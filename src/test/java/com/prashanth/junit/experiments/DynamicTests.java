package com.prashanth.junit.experiments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

@DisplayName("Testing Dynamic test feature \uD83D\uDE4C")
public class DynamicTests {

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
                dynamicTest("DT 01", () -> assertEquals(10, 5*2)),
                dynamicTest("DT 01", () -> assertTrue(true )),
                dynamicTest("DT 01", () -> assertEquals(20, 10*2))
        );
    }

}
