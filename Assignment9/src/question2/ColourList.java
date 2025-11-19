package question2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ColourList {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		
		Collections.sort(colors);
		
		for(String color : colors) {
			System.out.println(color);
		}
	}

}
