package com.internshala.javaapp.assignment3;
class Animal{
	String color;
	void run(){
		System.out.println("Animal is running");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
class D_og extends Animal{
	String breed;
	void bark(){
		System.out.println("wooh wooh !!");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
public class Puppy extends D_og{
	int size;
	int age;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	void run(){
		System.out.println("Puppy is running...");
	}
	public static void main(String[] arg){
		Puppy puppy = new Puppy();
		puppy.age=10;
		puppy.size=26;
		puppy.color="black";
		puppy.breed="Bulldog";
		System.out.println(puppy.getAge());
		System.out.println(puppy.getSize());
		System.out.println(puppy.getColor());
		System.out.println(puppy.getBreed());
		puppy.bark();
		puppy.run();
	}
}

