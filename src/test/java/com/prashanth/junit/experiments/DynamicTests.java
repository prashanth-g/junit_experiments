package com.prashanth.junit.experiments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;

public class DynamicTests {

    @TestFactory
    List<String> dynamicTestsWithInvalidReturnType() {
        return Arrays.asList("Hello");
    }

}
