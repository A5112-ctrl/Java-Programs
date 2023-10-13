package com.edu.condition;
import java.util.Scanner;
public class cond2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//Program to check the character is vowel or not
		System.out.println("Enter a character");
		char ch =sc.next().toLowerCase().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch +" is Vowel");
		}else {
			System.out.println(ch+" is Not a vowel");
		}
	

		
	}

}
