package com.edu.ifelse1;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		
		
//        //Largest of two no.
    Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		if(a>b) {
//			System.out.println(a+" is greater than "+b);
//		}
//		else {
//			System.out.println(b+" is greater than "+a);
//		}
//		
//		
//		
//		//Program to check even or odd
//		if (a%2==0)
//			System.out.println(a+" is Even");
//		else
//			System.out.println(a+" is Odd");
//
//		
//		
//		//program to check positive or negative
//		if (a<0)
//			System.out.println(a+" is negative");
//		else if(a==0)
//			System.out.println(a+ " is zero");
//		else
//			System.out.println(a+ " is Positive");
//		
//		
//		
//		//Largest of three no.
//		System.out.println("Enter 3 no.");
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		int z=sc.nextInt();
//		if (x>y && x>z) {
//			System.out.println(x+" is greater  than "+y+" and "+z);
//		}
//		else if (y>x && y>z) {
//			System.out.println(y+ " is greater than "+x+" and "+z);
//		}
//		else {
//			System.out.println(z+" is greater than "+y+" and "+x);
//		}
//		
//		
//		
		/*Calculate Electricity bill
		first 100   2/unit
 		next 200    3/unit
 		above 300   4/unit
		*/
    int units =0;
	double amount=0.0;
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter No. of units");
	units=scanner.nextInt();
	if(units>0 && units<=100 ) { //1 to 100
		amount = units * 2.00;
	}else if(units>100 && units<=200) { //150*3  or 100*2+50*3
		amount = 100*2.00 + (units-100)*3.00;
	}else {
		amount = 100*2.0+200*3.00+(units-300)*4.00;
	}
	
	System.out.println("Electricity Bill =Rs. "+amount);
		}

}