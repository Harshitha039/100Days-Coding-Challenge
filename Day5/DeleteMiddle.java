package com.palle;

import java.util.Scanner;

public class DeleteMiddle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] ar=new int[6];
		int currentsize= ar.length;
		System.out.println("Enter elements");
		for(int i=0;i<currentsize;i++)
		{
			ar[i]=sc.nextInt();
		}
		delete(3,currentsize,ar);
		currentsize--;
		
		 System.out.println("Array after deletion:");
        for (int i = 0; i < currentsize; i++) {
            System.out.print(ar[i] + " ");
        }

        sc.close();

	}

	private static void delete(int ele, int currentsize,int[] ar) {
		int pos=0;
		for(int i=0;i<currentsize;i++)
		{
			if(ar[i]==ele)
			{
				pos=i;
				break;
			}
			pos++;
		}
		for(int j=pos;j<currentsize-1;j++)
		{
			ar[j]=ar[j+1];
		}
		System.out.println("deleted successfully");
	}

}
