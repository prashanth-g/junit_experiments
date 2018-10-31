package com.prashanth.junit.experiments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Testing NestedTests Feature")
public class NestedClassTests {
    List<Integer> integerList;

    @Test
    @DisplayName("is initiated with new ArrayList")
    void isInstantiateWithNew() {
        new ArrayList<>();
    }

    @Nested
    @DisplayName("When new")
    class WhenNew {

        @BeforeEach
        void createNewArrayList() {
            integerList = new ArrayList<>();
        }

        @Test
        @DisplayName("isEmpty")
        void isEmptyArray() {
            assertTrue(integerList.isEmpty());
        }

        @Test
        @DisplayName("throws IndexOutOfBoundsException")
        void throwsIndexOutOfBoundsException() {
            assertThrows(IndexOutOfBoundsException.class, () -> integerList.get(0));
        }

    }

}
