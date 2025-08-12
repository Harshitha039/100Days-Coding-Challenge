package com.palle;

import java.util.Arrays;

public class ReverseString {
	public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println("After reversing: "+Arrays.toString(s));
    }
	public static void main(String[] args) {
		char[] s= {'H','e','l','l','o'};
		reverseString(s);

	}

}
