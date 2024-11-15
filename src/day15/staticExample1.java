package com.destination.jfs.day15;

class Calculator{
	static int  a,b,c;// static variables
	int m,n,o;// non-static variables
	//static block
	static {
		System.out.println("hi");
		a=100;
		b=200;
		c=300;
		}
	//non-static variables
	 {
		m=10;
		n=20;
		o=30;
	}
	 //static methods
	 static void display1() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(o);
		 }
	 //non-static methods
	 void display2() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 
	 }
}
public class staticExample1 {
public static void main(String args[]) {
	System.out.println("main");
	Calculator.display1();
	Calculator c=new Calculator();
	c.display2();
}
}
