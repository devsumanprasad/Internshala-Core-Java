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
