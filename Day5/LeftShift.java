package com.palle;

import java.util.Scanner;

public class LeftShift {

    public static void rotateLeft(int[] arr, int n) {
        int len = arr.length;
        n = n % len; // to avoid unnecessary full rotations

        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < len-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[len-1] = first;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Length");
        int len=sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter "+len+" numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of left rotations: ");
        int n = sc.nextInt();

        rotateLeft(arr, n);

        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
