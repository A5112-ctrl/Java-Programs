package com.edu.hw3;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		//Write a java program to input angles of a triangle and check whether triangle is valid or not.
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter measure of Sides of traingle");
		double side1=sc.nextDouble();
		double side2=sc.nextDouble();
		double side3=sc.nextDouble();
		//Triangle inequality Theoram
		if((side1+side2 >side3 )&&(side1 +side3 >side2)&&(side2+side3>side1)){
			System.out.println("The traingle having sides :"+side1+","+side2+","+side3+" is Valide Traingle");
		}
		else {
			System.out.println("The traingle having sides :"+side1+","+side2+","+side3+" is Valide Traingle");
		}
		sc.close();
	
	}

}
