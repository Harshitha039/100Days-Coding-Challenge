package com.palle;

import java.util.Scanner;

public class InsertMiddle {

    public static void insert(int ele, int pos, int[] ar, int currentSize) {
        if (pos >= 0 && pos <= currentSize && currentSize < ar.length) {
            for (int i = currentSize - 1; i >= pos; i--) {
                ar[i + 1] = ar[i];
            }
            ar[pos] = ele;
            System.out.println("Element inserted successfully");
        } else {
            System.out.println("Invalid position or array full");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[6];
        int currentSize = 5; // initially we have 5 elements filled

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < currentSize; i++) {
            ar[i] = sc.nextInt();
        }

        insert(7, 2, ar, currentSize);
        currentSize++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(ar[i] + " ");
        }

        sc.close();
    }
}
