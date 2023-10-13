package com.edu.switchcase;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		//Write a program to check num is even or odd using switch case
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int num=sc.nextInt();
		if (num==0) {
			System.out.println("The num is "+num+" hence it is special case");
		}else {
		switch(num%2) {
		case 0:
			System.out.println("The given number Even No.");
			break;
		case 1:
			System.out.println("The given number is Odd no.");
		}
		sc.close();
		}
	}

}
