package com.palle;

import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

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
        System.out.println("Original array:");
        printArray(arr);

        sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
        
        sc.close();
    }
}