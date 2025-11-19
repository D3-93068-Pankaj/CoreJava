package question1;

public class MinimumFromGenericArray {
	
	public static <T extends Number> T minimumElement(T[] arr){
		T min = arr[0];
		for(T ele : arr) {
			if(ele.doubleValue()<min.doubleValue())
				min = ele;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Integer[] intArr = {3, 4, 7, 9, 2};
		Double[] doubleArr = {4.7, 6.6, 8.9, 1.2};
		
		System.out.printf("Minimum Integer: %d\n", minimumElement(intArr));
		System.out.printf("Minimum Double: %.1f\n", minimumElement(doubleArr));
	}
}
