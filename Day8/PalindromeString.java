package com.palle;

public class PalindromeString {

	public static boolean isPalindrome(String s) {
        s=s.replace("[^A-Za-z]","");
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String s="Malayalam";
		if(isPalindrome(s))
		{
			System.out.println(s+" is palindrome");
		}
		else {
			System.out.println(s+" is not palindrome");
		}

	}

}
