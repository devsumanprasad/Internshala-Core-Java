/*
In your Intellij IDEA, within the class Dog, create two constructors:

First will be default constructor
Second will accept three parameters that will be used to initialize instance variables of breed,
 size and color
 */
package com.internshala.javaapp.assignment3;

public class Dog {
	private String breed;
	private int size;
	private String color;
	public void bark(){
		System.out.println("wooh wooh !! My breed is "+breed+". ");
	}
	public void run(){
		System.out.println("I am running.");
	}
	public Dog(){
		this("not Defined",0,"not Given");
	}

	public Dog(String breed, int size, String color){
		this.breed=breed;
		this.size=size;
		this.color=color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
class CallDog{
	public static void main(String[] arg){
		//Dog dog1 = new Dog("Bulldog",16,"Brown");
		Dog dog2 = new Dog();
		System.out.println("------Before assigning------"); //getter and setter used
		System.out.println(dog2.getBreed());
		dog2.setBreed("BullDog");
		System.out.println(dog2.getColor());
		dog2.setColor("Sky");
		System.out.println(dog2.getSize());
		dog2.setSize(26);
		System.out.println("------After assigning------");
		System.out.println(dog2.getBreed());
		System.out.println(dog2.getSize());
		System.out.println(dog2.getColor());

		dog2.bark();
		dog2.run();

		//dog1.bark();
		//dog1.run();
	}
}
