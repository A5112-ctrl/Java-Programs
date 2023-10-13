package com.edu.switchcase;

import java.util.Scanner;
class AreaOfFigures{
	static Scanner sc=new Scanner(System.in);
	static float area;
	static int l;
	public static void areaTriangle(){
		System.out.println("Enter length and Breadth");
		l=sc.nextInt();
		int b=sc.nextInt();
		area=0.5f*l*b;
		System.out.println("Area of Triangle: "+area);
	}
	public static void areaSquare() {
		System.out.println("Enter side of a Square :");
		int side=sc.nextInt();
		area=side*side;
		System.out.println("Area of square : "+area);
	}
	public static void areaRectangle() {
		System.out.println("Enter lenght and width :");
		 l=sc.nextInt();
		 int w=sc.nextInt();
		 area=l*w;
		 System.out.println("Area Of Rectangle :"+area);
	}
	public static void areaCircle() {
	System.out.println("Enter radius :");
	float r=sc.nextFloat();
	area=3.14f *r*r;
	System.out.println("Area of Circle :"+area);
	}	
}
public class AreaOfShapes2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("------Area Of Figures------");
		System.out.println("\n 1.Traiangle\n 2.Square\n 3.Rectangle\n 4.Circle");
		System.out.println("Enter a no You want Find Area :");
		int ch=sc.nextInt();
		AreaOfFigures a= new AreaOfFigures();
		switch(ch) {
		case 1:
			a.areaTriangle();
			break;
		case 2:
			a.areaSquare();
			break;
		case 3:
			a.areaRectangle();
			 break;
		case 4:
			a.areaCircle();
		break;
		default:
			System.out.println("Invalid Input");
		}
		
	}

}
