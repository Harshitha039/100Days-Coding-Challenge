package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	//Time complexity in both worst case and best case - O(n^2)
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
		
		//logic for selection sort
		for(int i = 0;i < n-1;i++)
		{
			int min = i;
			for(int j = i+1;j < n;j++)
			{
				if(ar[j] < ar[min])
				{
					min = j;
				}
			}
			if(min != i)
			{
				int temp = ar[i];
				ar[i] = ar[min];
				ar[min] = temp;
			}
		}
		
		System.out.println("Sorted array: " + Arrays.toString(ar));
		
		sc.close();
	}

}
