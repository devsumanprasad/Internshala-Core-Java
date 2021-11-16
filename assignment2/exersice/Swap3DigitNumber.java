/*
Accept a three digit number from the user (100 to 999). First, 
check that the number has only three digits. Then separate each digit of the number and 
then arrange them in the reverse order such that the middle digit remains the same and 
first and third digit are swapped.
Example -
Input: 347
Output: 743
 */
package com.internshala.javaapp.exersice;

import java.util.Scanner;

public class Swap3DigitNumber {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number : ");
		int num = sc.nextInt();
		int f=0;
		String str = Integer.toString(num);
		//System.out.println(str);
		if(str.length()==3){
			char[] ans = new char[3];
			int ptr=2;
			for(int i=0;i<3;i++){
				ans[i]=str.charAt(ptr);
				//System.out.println(ans[i]);
				ptr--;
			}

			String a = String.valueOf(ans);
			try{
				f=Integer.parseInt(a);
			} catch (NumberFormatException e){

			}

		}
		System.out.println("Reverse of "+num+" is "+f);
		sc.close();
	}
}
