package question2;

import java.util.Scanner;

public class Circle{
	private int myX;
	private int myY;
	private double diameter;
	
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.diameter = 100;
	}
	
	public Circle(int x,int y, double diameter) throws DimensionMismatchException{
		myX = x;
		myY = y;
		if(diameter<0)
			throw new DimensionMismatchException();
		this.diameter = diameter;
	}
	
	public void setX(int x) {
		myX = x;
	}
	
	public int getX() {
		return myX;
	}
	
	public void setY(int y) {
		myY = y;
	}
	
	public int getY() {
		return myY;
	}
	
	public void setDiameter(double diameter) throws DimensionMismatchException{
		if(diameter < 0)
			throw new DimensionMismatchException();
		this.diameter = diameter;
	}
	
	public double getDiameter() {
		return this.diameter;
	}	
	
}
