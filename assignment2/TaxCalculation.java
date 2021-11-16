package com.internshala.javaapp.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class TaxCalculation {
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println(" Tax Calculator App ");
		System.out.println("------WELCOME---------");
		System.out.println("Enter Total person count : ");
		n= sc.nextInt();
		String[] str = new String[n];
		int anualIncom[] = new int[n];
		int taxes[] = new int[n];
		Arrays.fill(taxes,0);
		Arrays.fill(anualIncom,0);
		Arrays.fill(str,"");
		//int j=0;
		for(int i=0;i<n;i++){
			System.out.println("Enter name"+(i+1)+" : ");
			str[i] = sc.next();
			System.out.println("Enter "+str[i]+"\'s Anual Income : ");
			anualIncom[i]=sc.nextInt();
			//j++;
		}
		for(int j=0;j<n;j++){
			taxes[j]=calcTax(anualIncom[j]);
		}
		System.out.println("Names with liable taxes");
		System.out.println("-------------------------");
		for(int i=0;i<n;i++){
			System.out.println(str[i]+" : "+"₹"+taxes[i]);
		}
		/*System.out.println(Arrays.toString(taxes));
		System.out.println(Arrays.toString(anualIncom));
		System.out.println(Arrays.toString(str)); */
		sc.close();

	}

	static int calcTax(int i) {
		double tax=0;
		if(i>=300000){
			tax = (double)i*(20/100.0);
		}
		else if(i>=100000){
			tax = (double)i*(10/100.0);
		}
		else {
			tax=0;
		}
		return (int)tax;
	}
}
