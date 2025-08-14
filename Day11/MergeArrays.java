package com.palle;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] a= {2,1,3,4,6,5};
		Arrays.sort(a);
		int[] b= {3,1,6,3,5};
		Arrays.sort(b);
		int first=0;
		int second=0;
		int[] c=new int[a.length+b.length];
		int index=0;
		while(first!=a.length && second!=b.length)
		{
			if(a[first]<=b[second])
			{
				c[index++]=a[first];
				first++;
			}
			else
			{
				c[index++]=b[second];
				second++;
			}
		}
		while(first==a.length && second!=b.length)
		{
			c[index++]=b[second];
			second++;
		}
		while(first!=a.length && second==b.length)
		{
			c[index++]=b[first];
			first++;
		}
		System.out.println("First array is: "+Arrays.toString(a));
		System.out.println("Second array is: "+Arrays.toString(b));
		System.out.println("Merged array is: "+Arrays.toString(c));
	}

}
