package com.destination.jfs.day19;
 class cal {
double add(int a,double b,int c) {
	return a+b+c;
}
int add(int a,int b,int c) {
    return a+b+c;
}
float add(float a,float b) {
	return a+b;
	
}
double add(double a,double b,double c) {
	return a+b+c;
}
double add (int a,float b,double c) {
	return a+b+c;
	
}
float add(int a,int b) {
	return a+b;
	
}
double addfinal(double c,int a,float b) {
	return a+b+c;
}

public class Calculator{
	public static void main(String[] args) {
		int a1=10,b1=20,c1=30;
		float a2=100,b2=200,c2=306;
		double a3=101,b3=205,c3=380;
		cal c = new cal();
		System.out.println(c.add(a2, b2));
		System.out.println();
	}
	
}
}
