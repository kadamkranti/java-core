package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P051 {
public static void main(String args[])
   {
      String str, rev = "";
Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      str = sc.nextLine();
      int length = str.length();
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      if (str.equals(rev))
         System.out.println(" It is a palindrome");
      else
         System.out.println(" It is not a palindrome");
   }
}

/*package com.learning.core.day2session1;
import java.util.Scanner;
 
public class Palindrome
{
 
	public static void main(String[] args)
	{
		String str,rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		str = sc.nextLine();
		int length = str.length();
		for(int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		if(str.equals(rev))
			System.out.println("It is a palindrome ");
		else
			System.out.println("It is not a palindrome");
	}
 
}*/
