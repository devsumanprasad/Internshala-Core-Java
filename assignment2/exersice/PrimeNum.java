package com.internshala.javaapp.exersice;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean flg=true;
		//for loop
		if(n!=2 ){
			if(n==1){
				flg=false;
			}
			for(int i=2;i<n;i++){
				if(n%i==0){
					flg=false;
					break;
				}
			}
		}
		if(flg)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");

		//while loop
		if(n<2 && n>=0){
			flg=false;
		}
		else if(n==2){
			flg=true;
		}
		else{
			int cnt=2;
			while(cnt<n){
				if(n%cnt==0){
					flg=false;
					break;
				}
			}
		}
		if(flg){
			System.out.println(n+" is prime number");
		}
		else
			System.out.println(n+" is not a prime number");


		sc.close();

	}
}
