/*
Accept an array from a user,
duplicate it by creating a similar array and then try to compare it by equating
both arrays (using the == operator). The result will be false as
the duplicate arrays won't be equal to each other. Try to find the reason behind it
and also make the same by using a different function (you might need the help of
the internet for this).
 */
package com.internshala.javaapp.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] cpy = new int[n];
		System.arraycopy(arr,0,cpy,0,n);
		System.out.println(arr==cpy);

		//using Arrays.equals(int[]arr,int[]cpy) function
		System.out.println(Arrays.equals(arr,cpy));
		sc.close();
	}
}
