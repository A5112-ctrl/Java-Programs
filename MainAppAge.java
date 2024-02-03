package com.edu;

import java.util.Scanner;


	class MyException extends Exception{
		public MyException(String s) {
			super(s);
		}
	}
	public class MainAppAge {
		public void checkAge(int age) {
			try {
				if(age<15) {
					throw new MyException("invalid");
				}
				else {
					System.out.println("Valid");
				}
			}
				
			catch(Exception e) {
				e.printStackTrace();
				
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ur Age ");
			int age=sc.nextInt();
			MainAppAge obj=new MainAppAge();
			obj.checkAge(age);
		}
	}
	


