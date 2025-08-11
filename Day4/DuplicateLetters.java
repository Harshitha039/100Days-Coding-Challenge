package com.palle;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		str = str.toLowerCase();
		for(char ch : str.toCharArray())
		{
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
		boolean found = false;
		for(char key:map.keySet())
		{
			if(map.get(key) >1)
			{
				System.out.println(key+" : "+map.get(key));
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("No duplicate letters");
		}
		
		sc.close();
	}

}
