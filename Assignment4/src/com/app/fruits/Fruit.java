package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	protected String color;
	protected double weight;
	protected String name;
	protected boolean isFresh = false;
	
	protected Fruit() {
		
	}
	
	protected Fruit(String name, double weight, String color) {
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Fruit[Name: "+this.name+", Color: "+this.color+", Weight: "+this.weight+"]";
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter the color: ");
		this.color = sc.next();
		System.out.println("Enter the weight: ");
		this.weight= sc.nextDouble();
		System.out.println("Enter the name: ");
		this.name = sc.next();
		System.out.println("is the fruit fresh? If yes, press Y");
		if(sc.next().equalsIgnoreCase("Y")) {
			this.isFresh = true;
		}
		else {
			this.isFresh = false;
		}
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIsFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public boolean getIsFresh() {
		return this.isFresh;
	}

	public abstract String taste();
}
