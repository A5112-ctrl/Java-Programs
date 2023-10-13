package com.edu.hw3;

import java.util.Scanner;

public class EquiTriangle {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Sides Of Traingle: ");
	double side1=sc.nextDouble();
	double side2=sc.nextDouble();
	double side3=sc.nextDouble();
	
	if( (side1==side2) && (side2==side3) && (side1==side3) ) {
		System.out.println("The traingle having sides :"+side1+","+side2+","+side3+" is Equilateral Traingle");	
	}
	else {
		System.out.println("The traingle having sides :"+side1+","+side2+","+side3+" is Not Equilateral Traingle");
		
	}
sc.close();
	}

}
