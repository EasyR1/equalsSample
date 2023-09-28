package org.example.arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortingTest {

    private ArraySorting arraySorting = new ArraySorting();
    @Test
    void testSortIntArray() {
        int[] arr = {1, 2, 7, 50, 14, 4, 2};
        arr = arraySorting.sortArray(arr);
        int[] result = {1, 2, 2, 4, 7, 14, 50};

        assertArrayEquals(arr, result);
    }

    @Test
    void testSortDoubleArray() {
        double[] arr = {1.0, 2.0, 7.5, 50.0, 14.0, 4.5, 2.1};
        arr = arraySorting.sortArray(arr);
        double[] result = {1.0, 2.0, 2.1, 4.5, 7.5, 14.0, 50.0};

        assertArrayEquals(arr, result);
    }

    @Test
    void testSortStringArrayBasic() {
        String[] arr = {"Base", "Dec", "Bdde", "1"};
        arr = arraySorting.sortArray(arr);
        String[] result = {"1", "Base", "Bdde", "Dec"};

        assertArrayEquals(arr, result);
    }

    @Test
    @Disabled
    void testSortStringArrayAdvanced() {
        String[] arr = {"Base", "Dec", "Bdde", "1"};
        arr = arraySorting.sortArray(arr);
        String[] result = {"Dec", "Bdde", "Base", "1"};

        assertArrayEquals(arr, result);
    }
}