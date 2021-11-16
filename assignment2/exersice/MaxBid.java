/*
It's time for the highest bid. Ask three friends of yours to enter their bid for a
Harry Potter antique broomstick and find out the highest bid by writing a program to calculate
so in just a single line.
 */
package com.internshala.javaapp.exersice;

import java.util.Scanner;

public class MaxBid {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int mx= a>b && a>c?a:(a<b&&b<c?c:b);
		System.out.println(mx);
		sc.close();

	}
}
