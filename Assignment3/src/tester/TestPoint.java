package tester;

import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		p1.acceptPoint();
		p1.getDetails();
		p2.acceptPoint();
		p2.getDetails();
		
		if(p1.isEqual(p2)) {
			System.out.println("The Points are equal!");
		}
		else {
			System.out.println("The distance between the points is: "+p1.calculateDistance(p2));     
		}
	}

}
