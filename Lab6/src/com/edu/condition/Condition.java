package com.edu.condition;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		/*
		 * Marks Grade 80 - 100 
		 * Grade A 50 - 79 
		 * Grade B 35 - 49 
		 * Grade C 0 - 34 Grade D
		 * less than 0 and more than 100 Invalid Marks
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		float m = sc.nextFloat();
		if(m>100 || m<0 ) {
			System.out.println("Invalid Marks");
		}
		else if (m >= 80 && m <= 100) {
			System.out.println("Grade A");
		} 
		else if (m >= 50 && m < 80) {
			System.out.println("Grade B");
		} 
		else if (m >= 35 && m < 50) {
			System.out.println("Grade C");
		} 
		else if (m < 34) {
			System.out.println("Grade D");
		
		}
	}

}
