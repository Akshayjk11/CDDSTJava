package com.destination.jfs.day16;
import java.util.Scanner;


public class ifelifelsestatementexample {
	public static void main(String[] args) {
		System.out.println("enter the age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age<18) {
			System.out.println("minor");
		}
		else if (age>=18 && age<60) {
			System.out.println("adult");
		}
		else {
			System.out.println("senor citizen");
		}
	}

}
