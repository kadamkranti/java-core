package com.learning.core.day2session1;
import java.util.*;
public class D02P053 {

	static List<String> al = new ArrayList<>();
	public static void main(String[] args)
	{
		String s = "abc";
	//	System.out.println("Enter string : ");
		findsubsequences(s, "");
		System.out.println(al);
 
	}
	private static void findsubsequences(String s,String ans)
	{
		if(s.length() == 0)
		{
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1),ans + s.charAt(0));
		findsubsequences(s.substring(1),ans);
	}
 
}
