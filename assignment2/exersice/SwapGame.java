/*
You work in pairs in the computer lab. Play a prank with your partner and swap the
marks entered for him with yours. Remember, you can only use 2 variables, else you'll
get caught.
Example -
Input: a = 24, b = 43
Output: a = 43, = 24
 */
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
