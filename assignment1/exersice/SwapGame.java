package com.internshala.javaapp.exersice;

import java.util.Scanner;

public class SwapGame {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" b="+b);
		sc.close();

	}
}
