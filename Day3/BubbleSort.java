package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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
		
		//logic for bubble sort
		for(int i = 0;i < n-1;i++)
		{
			int flag = 0;
			for(int j = 0;j < n-1-i;j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
			{
				break;
			}
		}
		
		System.out.println("Sorted array: " + Arrays.toString(ar));
		
		sc.close();
		
	}

}
