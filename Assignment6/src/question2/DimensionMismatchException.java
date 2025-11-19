package question2;

public class DimensionMismatchException extends Exception{
	public DimensionMismatchException() {
		
	}
	
	@Override
	public String getMessage() {
		return "Diameter cannot be negative!";
	}
}
