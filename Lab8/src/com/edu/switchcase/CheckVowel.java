package com.edu.switchcase;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character :");
		char ch = sc.next().toLowerCase().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("A Vowel ");
			break;
		default:
			System.out.println("Not a Vowel");
		}

		sc.close();
	}

}
