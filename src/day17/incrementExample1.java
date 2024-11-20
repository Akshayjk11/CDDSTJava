package com.destination.jfs.day17;

public class incrementExample1 {
	public static void main(String[] args) {
		int a=723;
		int b=--a - a-- + --a + a-- + a++ + a++ + ++a - ++a - a-- +  a-- + --a;

		System.out.println(b);
        System.out.println(a);
	}

}
