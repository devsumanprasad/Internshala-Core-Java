package com.internshala.javaapp.assignment1;

import java.util.Scanner;

public class StudentIDCARD {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String studentName;
		String bloodGrp;
		int age;
		System.out.println("Enter Student\'s Name : ");
		studentName=sc.nextLine();
		System.out.println("Enter Student\'s age : ");
		age=sc.nextInt();
		System.out.println("Enter Student\'s Blood group : ");
		bloodGrp=sc.next();
		String group;
		if(age>=20){
			group="RED";
		} else if(age>=15){
			group="BLUE";
		}
		else if(age>=10){
			group="YELLOW";
		}
		else{
			group="blank";
		}

		System.out.println("-------------------------------------");
		//System.out.println();
		System.out.println("Name : "+studentName);
		System.out.println("Age : "+age);
		System.out.println("Blood Group : "+bloodGrp);
		//System.out.println();
		System.out.println("--------------------------------------");
		//System.out.println();
		System.out.println("Your group is "+group);
		//System.out.println();
		System.out.println("--------------------------------------");

	}
}
