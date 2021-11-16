/*
Let's create a basic calculator using Java. The calculator will have the following functions:
Addition
Subtraction
Multiplication
Division
Remainder

Make sure that while performing division the denominator is not zero.
And if any user inputs zero, appropriate message should be displayed instead of a break
in execution. First ask the user to input the two operands and then output the results of
all the functions separately.
Example -
Input: a = 23, b = 12
Output: Add = 35
Sub = 11
Mul = 264
Div = 1

Example -
Input: a = 23, b = 0
Output: Add = 23
Sub = 23
Mul = 0
Div = Divide by 0 is not allowed
 */
package com.internshala.javaapp.assignment2;

import java.util.Scanner;

public class BasicCalculatorApp {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans[] = new String[5];
		ans = calc(a, b);
		for(String s : ans){
			System.out.println(s);

		}
		sc.close();
	}

	private static String[] calc(int a, int b) {
		String ans[] = new String[5];
		String[] tp=new String[4];
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div=0;
		String exp = "Divide by 0 is not allowed";
		boolean flg=true;
		try{
			div=a/b;
		} catch (ArithmeticException e){
			flg=false;
		}
		int rem=0;
		try{
			rem = a%b;
		} catch (ArithmeticException e){
			flg=false;
		}
		ans[0]="Add = "+sum;
		ans[1]="Sub = "+sub;
		ans[2]="Mul = "+mul;
		if(flg){
			ans[3]="Div = "+div;
			ans[4]="Rem = "+rem;
		}
		else{
			ans[3]="Div = "+exp;
			ans[4]="Div = "+exp;
			System.arraycopy(ans,0,tp,0,4);
			return tp;
		}

		return ans;
	}
}
