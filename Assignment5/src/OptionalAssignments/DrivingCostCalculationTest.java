package OptionalAssignments;

import java.util.Scanner;

public class DrivingCostCalculationTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for driving cost calculation");
		DrivingCostCalculation d1 = new DrivingCostCalculation();
		d1.accept(sc);
		System.out.printf("Your cost of driving per day is %.3f", d1.calculateDrivingCost());
	}

}

class DrivingCostCalculation{
	private double totalMilesDriven;
	private double costOfGasolinePerGallon;
	private double averageMilesPerGallon;
	private double parkingFeesPerDay;
	private double tollsPerDay;
	
	public void accept(Scanner sc) {
		System.out.println("Enter the total miles driven per day: ");
		this.totalMilesDriven = sc.nextDouble();
		System.out.println("Enter the cost per gallon per gasoline: ");
		this.costOfGasolinePerGallon = sc.nextDouble();
		System.out.println("Enter the average miles per gallon: ");
		this.averageMilesPerGallon = sc.nextDouble();
		System.out.println("Enter the parking fees per day: ");
		this.parkingFeesPerDay = sc.nextDouble();
		System.out.println("Enter the tolls per day: ");
		this.tollsPerDay = sc.nextDouble();
	}
	
	public double calculateDrivingCost() {
		return ((this.totalMilesDriven/this.averageMilesPerGallon)*this.costOfGasolinePerGallon)+this.parkingFeesPerDay+this.tollsPerDay;
	}
}
