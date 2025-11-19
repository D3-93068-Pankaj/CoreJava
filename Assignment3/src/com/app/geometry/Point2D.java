package com.app.geometry;

import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String getDetails() {
		String details = "X: "+this.x+" Y: "+this.y;
		return details;
	}
	
	public Boolean isEqual(Point2D p) {
		if(p.getX()==this.x && p.getY()==this.y) return true;
		else return false;
	}
	
	public double calculateDistance(Point2D p) {
		double distance = Math.sqrt(Math.pow(Math.abs(this.x - p.getX()),2) - Math.pow(Math.abs(this.y - p.getY()),2));
		return distance;
	}
	
	public void acceptPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x coordinate: ");
		this.x = sc.nextInt();
		System.out.println("Entert the y coordinate: ");
		this.y = sc.nextInt();
	}
	
}

