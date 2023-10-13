package com.edu.switchcase;

import java.util.Scanner;

public class AreaOfShapes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("------Area Of Figures------");
		System.out.println("\n 1.Traiangle\n 2.Square\n 3.Rectangle\n 4.Circle");
		System.out.println("Enter a no You want Find Area :");
		int ch=sc.nextInt();
		double area;
		switch(ch) {
		case 1:
			System.out.println("Enter length and Breadth");
			int l=sc.nextInt();
			int b=sc.nextInt();
			area=0.5*l*b;
			System.out.println("Area of Triangle: "+area);
			break;
		case 2:
			System.out.println("Enter side of a Square :");
			int side=sc.nextInt();
			area=side*side;
			System.out.println("Area of square : "+area);
			break;
		case 3:
			System.out.println("Enter lenght and width :");
			 l=sc.nextInt();
			 int w=sc.nextInt();
			 area=l*w;
			 System.out.println("Area Of Rectangle :"+area);
			 break;
		case 4:
			System.out.println("Enter radius :");
			double r=sc.nextDouble();
			area=3.14*r*r;
			System.out.println("Area of Circle :"+area);
		break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
