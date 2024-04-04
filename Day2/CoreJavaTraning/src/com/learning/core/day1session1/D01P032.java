package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P032 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	char choice;
	do {
	System.out.println("Print week name for given week ");
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("Enter the number :-");
	num = sc.nextInt();
	if(num==1) {
		System.out.println("Sunday");
	}else if(num==2) {
		System.out.println("Monday");
	}else if(num==3){
		System.out.println("Tuesday");
	}else if(num==4) {
		System.out.println("Wednesday");
	}else if(num==5) {
		System.out.println("Thursday");
	}else if(num==6) {
		System.out.println("Friday");
	}else if(num==7) {
		System.out.println("Saturday");
	}else {
		System.out.println("Enter the number in between 1 to 7 ");
	}System.out.println("\nIf you want to continue the select Yes or No !");
	 choice = sc.next().charAt(0);
}
	while(choice == 'y' || choice == 'y');
	System.out.println("\n Weekdays ! ");

}

}
