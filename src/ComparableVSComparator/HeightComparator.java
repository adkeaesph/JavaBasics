package ComparableVSComparator;

import java.util.Comparator;

public class HeightComparator implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getHeightInCms() < student2.getHeightInCms())
			return -1;
		if(student1.getHeightInCms() > student2.getHeightInCms())
			return 1;
		return 0;
	}
}
