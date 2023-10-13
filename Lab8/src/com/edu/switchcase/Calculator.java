package com.edu.switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		System.out.println("Enter \n1.Add \n2.Sub \n3.Mul\n4.Div\n5.Mod");
		int ch=sc.nextInt();
		switch (ch) {
			case 1:
				 c=a+b;
				System.out.println("Addition is :"+c);
				break;
			case 2:
				 c=a-b;
				System.out.println("Substraction is :"+c);
				break;
			case 3:
				c=a*b;
				System.out.println("Multiplication is :"+c);
				break;
			case 4:
				if(b!=0) {
				 c=a/b;
				 System.out.println("Division is :"+c);
				 break;
				}
				else 
				{
					System.out.println("Can not Divide By Zero");
				}
				
			case 5:
				c=a%b;
				System.out.println("Remainder is :"+c);
				break;
			
			default:
					System.out.println("Invalid Input");
		}
		sc.close();

	}

}
