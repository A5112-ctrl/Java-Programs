package com.edu.bill;
import java.util.Scanner;

public class BillCharges {
	public static void main(String[] args) {
				
//		Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
//		For first 50 units Rs. 0.50/unit
//		For next 100 units Rs. 0.75/unit
//		For next 100 units Rs. 1.20/unit
//		For unit above 250 Rs. 1.50/unit
//		An additional surcharge of 20% is added to the bill
		
		
Scanner sc=new Scanner(System.in);
	int units=0;
	double amount=0.0;
	System.out.println("Enter Your Electricty units :");
		units=sc.nextInt();
		if(units<=50 && units>0) 
		{
			amount=units*0.50;
		}
		else if(units>50 &&units<=100) 
		{
			amount=50*0.50+(units-50)*0.75;
		}
		else if(units<=250 &&units>100) 
		{
			amount=50*0.50+100*0.75+(units-150)*1.20;
		}
		else 
		{	
			amount=50*0.50+100*0.75+100*1.20+(units-250)*1.50;
			System.out.println("Amount "+amount);
		}

	double surcharge=0.20*amount;
	amount+=surcharge;
	System.out.println("Total Electricty bill amount is :"+amount);
sc.close();

	}
	

}
