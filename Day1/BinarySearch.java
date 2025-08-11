package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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
		
		//Binary Search Works Only On a Sorted Array
		Arrays.sort(ar);
		System.out.println("Sorted array: " + Arrays.toString(ar));
		
		System.out.println("Enter element to search:");
		int element = sc.nextInt();
		
		int lowindex = 0;
		int highindex = ar.length-1;
		boolean found = false;
		int position = -1;
		
		while(lowindex <= highindex)
		{
			int middle = (lowindex+highindex)/2;
			//if element present at middle position
			if(element == ar[middle])
			{
				found = true;
				position = middle;
				break;
			}
			//if element less than middle element ignore right half
			else if(element < ar[middle])
			{
				highindex = middle - 1;
			}
			//if element greater than middle element ignore right half
			else
			{
				lowindex = middle + 1;
			}		
		}
		
		if(found)
		{
			System.out.println(element + " found at position "+  (position + 1));
		}
		else
		{
			System.out.println(element +" not found");
		}
		
		sc.close();
	}

}
