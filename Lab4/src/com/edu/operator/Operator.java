
package com.edu.operator;
import java.util.Scanner;
public class Operator {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three values u want to perform all opearion");

	int a=10,b=20;
	boolean c=true;
	
	//unary operator --increment,decrement
	System.out.println(++a);//11
	System.out.println(a++);//11 >>12 
	System.out.println(a--);//12 >>11
	System.out.println(--a);//10
	System.out.println(a++ + ++a); //11+12 =23
	System.out.println(--a + a--); //11+11==22 ....here value of last a is 11
	System.out.println(a);
	System.out.println(~a); //-11
	System.out.println(!c); //false
	
	
	//Arithematic operator -- * / + - % 
	System.out.println(a+b); //10+20 =30
	System.out.println(a-b); //10-20 =-10
	System.out.println(a*b); //10*20 =200
	System.out.println(a/b); //10/20 =0
	System.out.println(a%b); //10%20 =10
	System.out.println(10*10/5+3-1*4/2);  //BODMAS Rule
					//10*2+3-1*2 >> 20+3-2  >>20+1 >>21
	
	//shift -- << >> >>>
	System.out.println(10<<2);	//10*2^2 >> 10*4=40
	System.out.println(10<<3);	//10*2^3 >> 10*8=80
	System.out.println(10>>2);	//10/2^2 >> 10/4 =2
	System.out.println(10>>3);	//10/2^3 >> 10/8 =1
	System.out.println(10>>>3); //it will work same as >>  //1
	
	//Relational operator -- < > <= >=  == !=
	//a=10 b=20
	System.out.println(a<b); //10<20 --true
	System.out.println(a>b);	//10>20 --false
	System.out.println(a<=b);	//10<=20 --true
	System.out.println(a>=b);	//10>=20 --false
	System.out.println(a!=b);	//10!=20 --true
	
	//bitwise -- &-(and) |/^ -(or) and Logical operator -- && || 
	//a=10 b=20
	System.out.println(a>b && b>++a); //false &&false >>false   >>in && if first false then it will not check further condition
	System.out.println(a); //10
	System.out.println(a>b & b>a++); //false & false >>false   >>in & if first false then also it will check further condition
	System.out.println(a); //11
	System.out.println(a<b || b>++a); //true ||false >>true		>>in || if first false then it will not check further condition
	System.out.println(a); //11
	System.out.println(a<b | b>a++); //true |false >>false		>>in | if first false then also it will check further condition
	System.out.println(a); //12
	
	
	//Ternary operator  -- stmt1 ? true : false

	//largest among no.  >> a=12 b=20
	int l2= (a>b?a:b);
	System.out.println("Largest of "+a+" and "+b+"is :"+l2);
	
	int x=40,y=20,z=86;
	int l3=(x>y && x>z) ? x :(y>x && y>z)? y :z;
	System.out.println("Largest of "+x+","+y+","+z+" is "+ l3);
	
	int w=76;
	int l4=(x>y && x>z && x>w)? x:(y>x && y>z &&y>w) ? y :(z>x && z>y && z>w) ? z :w;
	System.out.println("Largest of "+w+","+ x+","+ y+","+ z+" is "+ l4);
	
	//Assignment operator -- = += -= *= /= %=,etc
	x+=4;   //x=40+4  >>44
	System.out.println(x);
	x-=4;	//x=44-4  >>40
	System.out.println(x);
	x*=4;	//x=40*4  >>160
	System.out.println(x);
	x/=4;	//x=160/4  >>40
	System.out.println(x);
	x%=4;	//x=40%4  >>0
	System.out.println(x);
	x=x+y;  //x=0+20  >>20
	System.out.println(x);
	
	//Type cast
	float p1=98.46f,p2=87.98f;
	p1=p1+p2;
	System.out.println(p1);
	
}

}




/* 
 * 
 * Variable --
 *
 * local - scope within the method
 * 		 - if we can't assigh value it will throw an error 
 * 		 - (compile time error) 
 * global-scope within whole program 
 * 		 -declared outside method and inside the class 
 * 		 - default value :
 * 			int -0
 * 			float -0.0
 * 			String -null
 * 			bolean -false
 * 1)instance -
 * 2)static -with static keyword
 *  
 * 
 * 
 * */
/*
java, 
basic advance java 8 features 
devops, 
testing, 
design pattern
mysql
Hibernate
spring
springboot
HTML
CSS
javascript
Bootstrap
typescript
Angular
 * 
 */



