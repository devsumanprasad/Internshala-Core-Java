/*
Your computer teacher has given you the task of recording the marks of every student in
your class. The name, roll number, and marks of every student should be present in your list.
Use your Java skills to achieve the same and print the complete list.
 */
package com.internshala.javaapp.assignment3.exercise.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerTeacher {
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		ComputerTeacher ct = new ComputerTeacher();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		ct.setFunc(s1,"Dev",01,89);
		ct.setFunc(s2,"Jigyasha",02,98);
		ct.setFunc(s3,"Shiv Sagar",03,78);
		ct.setFunc(s4,"Priya",04,87);
		List<Student> st = new ArrayList();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);

		for(Student s : st){
			ct.show(s);
		}


	}
	void setFunc(Student s,String name, int roll, int marks){
		s.setName(name);
		s.setRoll(roll);
		s.setMarks(marks);
	}
	void show(Student s){
		System.out.println("======================================");
		System.out.println("Name : "+s.getName());
		System.out.println("Roll : "+s.getRoll());
		System.out.println("Marks : "+s.getMarks());
		System.out.println("======================================");
	}
}
class Student{
	private int roll;
	private String name;
	private int marks;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
