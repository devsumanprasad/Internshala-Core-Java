/*
Create an interface called perimeter with a method for calculating the perimeter.
Now define this method in the Area class of the previous question and use to calculate
the perimeter of the Rectangle in the Main class.
 */
package com.internshala.javaapp.assignment3.exercise.ex3;

import java.util.Scanner;

public class CalcPerimeter extends Rectangle{ //Main class
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		float length = sc.nextFloat();
		float breagth = sc.nextFloat();
		r1.setLength(length);
		r1.setBreagth(breagth);
		r2.setLength(34.0f);
		r2.setBreagth(67.9f);
		Perimeter p1 = r1;
		Perimeter p2 = r2;
		System.out.println(p1.calcPerimeter());
		System.out.println(p2.calcPerimeter());
		sc.close();

	}

}
interface Perimeter{ //Interface
	abstract public float calcPerimeter();
}
class Rectangle implements Perimeter{ //Area class
	private float length;
	private float breagth;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreagth() {
		return breagth;
	}

	public void setBreagth(float breagth) {
		this.breagth = breagth;
	}

	@Override
	public float calcPerimeter() {
		return length*breagth;
	}
}
