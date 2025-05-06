
// 6) 
// Write a Java program to find the largest and smallest elements in an array of integers.
// Implement a function to reverse an array in place.
// Given two arrays, write a method to merge them into a single sorted array.


import java.util.*;

public class ArrayOperations {

    // A) Find largest and smallest
    public static void findLargestAndSmallest(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }

    // B) Reverse array in-place
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // C) Merge and sort two arrays
    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        // Copy arr1
        for (int i = 0; i < arr1.length; i++)
            merged[i] = arr1[i];

        // Copy arr2
        for (int i = 0; i < arr2.length; i++)
            merged[arr1.length + i] = arr2[i];

        // Sort
        Arrays.sort(merged);

        return merged;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 7, 1, 9, 3};

        System.out.println("Original Array: " + Arrays.toString(array1));
        findLargestAndSmallest(array1);
        reverseArray(array1);

        int[] array2 = {5, 2, 8};
        int[] mergedSorted = mergeAndSortArrays(array1, array2);

        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedSorted));
    }
}
