/*
Play a little prank with your friends and swap their names in the attendance website.
Use Java to code a program to perform this.
Keep in mind that you do not have any additional space for more variables. Use just two.
Example -
Input: a = "Harry", b = "Drake"
Output: a = "Drake", b = "Harry"
 */
package com.internshala.javaapp.exersice;

import java.util.Scanner;

public class SwapStrings {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("str1= "+str1+" And str2= "+str2);
		str1 = str1+str2;
		//System.out.println(str1);
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println("After Swap ---------------- We have ");
		System.out.println("str1= "+str1+" And str2= "+str2);
		sc.close();


	}
}
