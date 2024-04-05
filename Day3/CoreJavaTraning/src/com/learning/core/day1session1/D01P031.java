package com.learning.core.day1session1;

import java.util.Scanner;
 
public class D01P031 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Month=0;
		String month;
		Scanner sc = new Scanner(System.in);
		System.out.println("* Enter the NUMBER :- ");
		Month = sc.nextInt(); 

		switch(Month) {
		case 1:
			month="Jan";
			break;
		case 2:
			month="Feb";
			break;
		case 3:	
			month="March";
			break;
		case 4:
			month="Apr";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="Aug";
			break;
		case 9:
			month="Sep";
			break;
		case 10:
			month="Oct";
			break;
		case 11:
			month="Nov";
			break;
		case 12:
			month="Dec";
			break;

		default:
			System.out.println("Enter valied Number :- ");
			month="invalid Month :-";

		}
		System.out.println(month);

 
	}
 
 
	}
