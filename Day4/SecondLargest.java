package com.palle;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max=arr[0];
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max =arr[i];
			}
			else if( arr[i]>secondMax && arr[i]!=max)
			{
				secondMax=arr[i];
			}
		}
		System.out.println("Second Largest number in array is "+secondMax);

		sc.close();
	}

}
