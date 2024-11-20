package com.destination.jfs.day17;
import java.util.Scanner;

public class switchcaseExapmple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the first choice:");
		int n1 = sc.nextInt();
		System.out.println("please enter the second choice:");
		int n2 = sc.nextInt();
		System.out.println("please select the option:\n"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. multiplication\n"
				+ "4. Divison\n");
		int choice = sc .nextInt();
		int res;
		switch (choice) {
		case 1:{ 
			System.out.println("Addition Operation");
			res = n1+n2;
			System.out.println(res);
			break;
			
			}
		case 2:{ 
			System.out.println("Subraction Operation");
			res = n1-n2;
			System.out.println(res);
			break;
		}
		case 3:{ 
			System.out.println("Multiplication Operation");
			res = n1*n2;
			System.out.println(res);
			break;
		}
		case 4:{ 
			System.out.println("Division Operation");
			res = n1/n2;
			System.out.println(res);
			break;
		}
		default:
			System.out.println("your choice doesnot match yhe given option");
		}
		}

}
