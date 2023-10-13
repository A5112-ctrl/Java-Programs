
//program to input differnent datatype values and display
package com.edu.inputdatatype;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//variable declaration
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		String fname;
		String name;
		
		//input data
		
		System.out.println("Enter your full name");
		name = sc.nextLine();

		System.out.println("Enter byte value");
		b = sc.nextByte();
		
		System.out.println(" Your First name ");
		fname = sc.next();

		System.out.println("Enter Integer Value");
		i = sc.nextInt();

		System.out.println("Enter Long Value");
		l = sc.nextLong();
		
		System.out.println("Enter Short Value ");
		s = sc.nextShort();
		
		System.out.println("Enter Float Value :");
		f = sc.nextFloat();
		
		System.out.println("Enter Double value ");
		d = sc.nextDouble();

		//output data 
		System.out.println("Byte value is "+b);
		System.out.println("Full Name is "+name);
		System.out.println("First name is "+fname);
		System.out.println("Integer value is "+i);
		System.out.println("Long Value is "+l);
		System.out.println("Short Value is "+s);
		System.out.println("Float value is "+f);
		System.out.println("Double value is "+d);
		
		
	}
}
