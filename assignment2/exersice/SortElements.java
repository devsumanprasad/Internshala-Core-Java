/*
Write a program to accept an array of integers from the user.
After accepting the input, arrange the elements in such a way that the largest
element is at the last index and the smallest is at the 0th index.
The first line of input will denote the number of elements in the array followed by
the elements. Finally, output the re-arranged array in ascending order.
Example -
Input: 5
64 1 32 978 12
Output: 1 12 32 64 978
 */
package com.internshala.javaapp.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class SortElements {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter "+n+" Elements one by one - ");
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		int[] ans = sortEle(arr,n);
		for(int i : ans){
			System.out.print(i+" ");
		}
		sc.close();
	}
	static int[] sortEle(int [] arr, int n){
		if(n<=1){
			return arr;
		}
		else{
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					if(arr[i]>arr[j]){
						arr[i]=arr[i]+arr[j];
						arr[j]= arr[i]-arr[j];
						arr[i]=arr[i]-arr[j];
					}
				}
			}
		}
		return arr;
	}
}
