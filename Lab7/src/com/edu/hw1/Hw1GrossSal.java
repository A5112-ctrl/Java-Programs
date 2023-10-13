package com.edu.hw1;
import java.util.Scanner;

public class Hw1GrossSal {

	public static void main(String[] args) {
		/*Write a Java program to input basic salary of an employee 
		 and calculate its Gross salary according to following:
			Basic Salary <= 10000 : HRA = 20%, DA = 80%
			Basic Salary <= 20000 : HRA = 25%, DA = 90%
			Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
		//formula:		gross_sal=hra+da+bsic_sal
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary :");
		double sal=sc.nextDouble();
		double hra,da;
		if(sal<=10000) {
			hra=0.2*sal;
			da=0.8*sal;
		}
		else if(sal<=20000) {
			hra=0.25*sal;
			da=0.9*sal;
		}else {
			hra=0.3*sal;
			da=0.95*sal;
		}
		double gross_sal=sal+hra+da;
		System.out.println("Gross Salary :"+gross_sal);
		sc.close();
	}

}
