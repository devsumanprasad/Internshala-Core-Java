package com.internshala.javaapp.assignment3.assignment;

public class Pastry extends Cake{
	private String name;
	private float price;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public void display(){
		System.out.println(name+" : ₹ "+price+" per piece");
	}
}
