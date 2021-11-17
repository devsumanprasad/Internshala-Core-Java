package com.internshala.javaapp.assignment3.assignment;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String [] arg){
		Cake cake1 = new Cake();
		Cake cake2 = new Cake();
		cake1.setName("Chocolate Brownie");
		cake1.setPrice(250.0F);
		cake2.setName("Chocolate Maple");
		cake2.setPrice(300.0F);

		List<Cake> cake = new ArrayList();
		cake.add(cake1);
		cake.add(cake2);

		Pastry pastry1 = new Pastry();
		Pastry pastry2 = new Pastry();
		pastry1.setPrice(35.0F);
		pastry1.setName("Black Forest");
		pastry2.setName("Choco Truffle");
		pastry2.setPrice(40.0F);

		List<Pastry> pastry = new ArrayList();
		pastry.add(pastry1);
		pastry.add(pastry2);

		System.out.println("     Today's Special Menu     ");
		System.out.println("--------------------------------");
		System.out.println("Special Cakes");
		System.out.println("---------------------------");
		for(Cake c : cake){
			c.display();
		}
		System.out.println("Special Pastries");
		System.out.println("---------------------------");
		for(Pastry p : pastry){
			p.display();
		}


	}
}
