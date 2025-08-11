package com.palle;

import java.util.Scanner;

public class ReverseWord {
	public static String wordReverse(String str)
	{
		String[] str1=str.split(" ");	
		String str2="";
		for(int i=str1.length-1;i>=0;i--)
		{
			str2=str2+str1[i]+" ";
		}
		return str2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("String after reverse: "+ wordReverse(str));

		sc.close();
	}

}
