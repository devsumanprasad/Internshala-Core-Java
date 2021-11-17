/*
Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs'
with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
Now create an object for each of the subclasses and call their respective methods.
 */
package com.internshala.javaapp.assignment3.exercise.ex4.testing;

public class CallMain {
	public static void main(String[] arg){
		//Animals d1 = new Dogs();
		//d1.dogs();
		//d1=new Cats();
		//d1.cats();
		Dogs d1 = new Dogs();
		Cats c1 = new Cats();
		d1.dogs();
		c1.cats();

	}
}
