package exceptionhandling;

public class ExceptionLineTooLong  extends Exception{
	private int invalidValue;
	
	public ExceptionLineTooLong() {
		
	}
	
	public ExceptionLineTooLong(int invalidValue){
		this.invalidValue = invalidValue;
	}
	public int getInvalidValue() {
		return invalidValue;
	}
	public void setInvalidValue(int invalidValue) {
		this.invalidValue = invalidValue;
	}
	
	@Override
	public String getMessage() {
		return String.format("The String is too long, Length: %d", this.invalidValue);
	}
}
