package com.palle;

public class RemoveDuplicateStringBuilder {
	public static String removeDuplicated(String s)
	{
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(sb.indexOf(String.valueOf(c))==-1)
			{
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s="programming";
		System.out.println("original string: "+s);
		System.out.println("string without duplicates: "+removeDuplicated(s));

	}

}
