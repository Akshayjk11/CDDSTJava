package com.destination.jfs.day15;
import java.util.Scanner;

class Employee{
	String name;
	static String company;
	int age;
	int salary;
	
	static {
		company="TCS";
	
	}
void collectData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	name = sc.next();
	System.out.println("enter the age");
	age = sc.nextInt();
	System.out.println("enter the salary");
	salary = sc.nextInt();
	
	
}
void display() {
	System.out.println(name);
	System.out.println(company);
	System.out.println(age);
	System.out.println(salary);
}
}
public class staticExample2 {
	public static void main(String[] args) {
	Employee e1 = new Employee();	
	Employee e2 = new Employee();
	System.out.println("Employee - 1 Details :");
	e1.collectData();
	e1.display();
	System.out.println("Employee  - 2 Details : ");
	e2.collectData();
	e2.display();
	
		
	}
}



