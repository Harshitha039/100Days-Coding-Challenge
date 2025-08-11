package com.palle;

import java.util.Scanner;

public class RightShift {

    public static void rotateRight(int[] arr, int n) {
        int len = arr.length;
        n = n % len; // to avoid unnecessary full rotations

        for (int i = 0; i < n; i++) {
            int last = arr[len - 1];
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
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

        System.out.print("Enter number of right rotations: ");
        int n = sc.nextInt();

        rotateRight(arr, n);

        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

