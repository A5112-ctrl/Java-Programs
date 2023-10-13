package com.edu.hw2;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		
//		Write a java program to calculate profit or loss.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Selling Price :");
		double sp = sc.nextDouble();
		
		System.out.println("Enter Cost Price :");
		double cp = sc.nextDouble();

		if (sp > cp) {
			double profit = sp - cp;
			System.out.println("Profit :$" + profit);
		} 
		else if (cp > sp) {
			double loss = cp - sp;
			System.out.println("Loss :$" + loss);
		}
		else {
			System.out.println("No profit,No Loss");
		}
		sc.close();
	}

}
