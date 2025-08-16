package com.palle;

public class RemoveDuplicates2Pointer {
	public static String removeDuplicates(String s)
	{
		char[] c=s.toCharArray();
		int index=0;
		for(int i=0;i<c.length;i++)
		{
			boolean seen=false;
			for(int j=0;j<index;j++)
			{
				if(c[i]==c[j])
				{
					seen=true;
					break;
				}
			}
			if(!seen)
			{
				c[index++]=c[i];
			}
		}
		return new String(c,0,index);
	}
	public static void main(String[] args) {
		String s="programming";
		System.out.println("original string: "+s);
		System.out.println("string without duplicates: "+removeDuplicates(s));
	}

}
