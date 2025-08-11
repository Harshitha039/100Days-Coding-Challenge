package com.palle;

import java.util.Scanner;

public class MergeSort {

    // Recursive method to divide and sort the array
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Recursively sort first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Merge two sorted halves of the array
    public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of two subarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[middle + 1 + j];

        // Merge the temp arrays

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            array[k++] = L[i++];
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            array[k++] = R[j++];
        }
    }

    // Main method to test
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number of array elements:");
    	int n = sc.nextInt();
        int[] arr = new int[n];
    	System.out.println("Enter array elements:");
    	for(int i = 0;i < arr.length;i++)
    	{
    		arr[i] = sc.nextInt();
    	}

        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
        
        sc.close();
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
