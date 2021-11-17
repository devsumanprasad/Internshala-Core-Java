package com.internshala.javaapp.assignment3;

import java.util.Scanner;

public class Rectangle {
	public float length;
	public float width;

	public float getArea(){
		float ar = length*width;
		return ar;
	}
	public float getperimeter(){
		float pr = 2*(length+width);
		return pr;
	}
}
class Main{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		Rectangle rect1 = new Rectangle();
		rect1.width=sc.nextFloat();
		rect1.length=sc.nextFloat();
		System.out.println("Area is : "+rect1.getArea());
		System.out.println("Perimeter is : "+rect1.getperimeter());
		sc.close();
	}
}
