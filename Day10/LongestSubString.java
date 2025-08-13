package com.palle;

import java.util.HashSet;

public class LongestSubString {

	public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        HashSet<Character> myset=new HashSet<>();
        int max_len=0;
        while(right<s.length())
        {
            char x=s.charAt(right);
            while(myset.contains(x))
            {
                myset.remove(s.charAt(left++));
            }
            myset.add(x);
            max_len=Math.max(max_len,right-left+1);
            right++;
        }
        return max_len;
    }
	public static void main(String[] args) {
		String s="kannada";
				
		System.out.println("Length of longest sub string is: "+lengthOfLongestSubstring(s));

	}

}
