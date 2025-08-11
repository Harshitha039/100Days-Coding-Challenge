package com.palle;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		
		int[] ar= new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<=ar.length-1;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter element to search");
		int element= sc.nextInt();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(element==ar[i])
			{
				System.out.println(element+ " is found at position "+ (i+1));
				return;
			}
		}
		System.out.println(element+" not found");
		
		sc.close();
	}

}
