package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	//Time complexity in worst case - O(n^2)
	//Time complexity in best case - O(n)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		System.out.println("Enter array elements:");
		for(int i = 0;i < ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		//logic for insertion sort
		for(int i=1;i<n;i++)
		{
			int temp = ar[i];
			int j = i-1;
			while(j >= 0 && ar[j] > temp)
			{
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = temp;
		}
		
		System.out.println("Sorted array: " + Arrays.toString(ar));
		
		sc.close();
	}

}
