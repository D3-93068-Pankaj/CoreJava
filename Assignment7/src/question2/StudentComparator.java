package question2;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student x, Student y) {
		int diff = x.getCity().compareTo(y.getCity());
		if(diff == 0)
			diff = Double.compare(x.getMarks(), y.getMarks());
		if(diff == 0)
			diff = x.getName().compareTo(y.getName());
		return diff;
	}
}
