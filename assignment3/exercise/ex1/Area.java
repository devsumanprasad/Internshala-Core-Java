/*
Calculate the area of different figures like rectangle, square, circle.
Input the operands by the user for side length or radius. For performing the same
create a different class Area and make the methods for the different figures.
Then in the Main class, use the Area class to perform these operations.
Example -
Input: Radius = 3
Output: 28.26
 */
package com.internshala.javaapp.assignment3.exercise.ex1;

import java.util.Scanner;

public class Area {
	static Scanner sc = new Scanner(System.in);
	public void findAreaOfCircle(){
		Circle circle = new Circle();
		System.out.println("Enter Radius : ");
		float radius= sc.nextFloat();
		float area;
		circle.setRadius(radius);
		area=circle.calcArea();
		System.out.println("Area of the circle : "+area);

	}
	public void findAreaOfSqare(){
		Square square = new Square();
		System.out.println("Enter side of square : ");
		float side = sc.nextFloat();
		square.setSide(side);
		float area = square.calcArea();
		System.out.println("Area of square : "+area);
	}
	public void findAreaOfRectangle(){
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter length and width of a rectangle respectively : ");
		float length = sc.nextFloat();
		float width = sc.nextFloat();
		rectangle.setLength(length);
		rectangle.setWidth(width);
		float area = rectangle.calcArea();
		System.out.println("Area of rectangle : "+area);
	}


}
class Circle{
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float calcArea(){
		final float PI = 3.14f;
		return PI*radius*radius;
	}
}
class Rectangle{
	private float width;
	private float length;

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	public float calcArea(){
		return length*width;
	}
}
class Square{
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	public float calcArea(){
		return side*side;
	}
}
//ClientArea == Main here
class clientArea extends Area{
	public static void main(String [] ar){
		//Rectangle rectangle = new Rectangle();
		//Square square = new Square();
		showMessage();
		int sw = Area.sc.nextInt();
		switchFunc(sw);
		Area.sc.close();
	}
	static void switchFunc(int sw){
		Area area = new Area();
		switch(sw){
			case 1 :
				area.findAreaOfCircle();
				showMessage();
				sw = Area.sc.nextInt();
				switchFunc(sw);
				break;
			case 2 :
				area.findAreaOfSqare();
				showMessage();
				sw = Area.sc.nextInt();
				switchFunc(sw);
				break;
			case 3 :
				area.findAreaOfRectangle();
				showMessage();
				sw = Area.sc.nextInt();
				switchFunc(sw);
				break;
			case 4 :
				System.exit(0);
				break;
			default:
				System.out.println("invalid option");
				showMessage();
				sw = Area.sc.nextInt();
				switchFunc(sw);
				break;
		}
	}
	static void showMessage(){
		System.out.println("----------------------------");
		System.out.println("press 1 for Area of Circle");
		System.out.println("press 2 for Area of Square");
		System.out.println("press 3 for Area of Rectangle");
		System.out.println("press 4 for exit");
		System.out.println("----------------------------");
	}
}
