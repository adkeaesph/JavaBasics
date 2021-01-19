package ComparableVSComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"Ram",162));
		students.add(new Student(3, "Lata", 169));
		students.add(new Student(2, "Amar", 160));
		
		
		Collections.sort(students); //using Comparable
		for(Student s:students) 
			System.out.println(s);
		
		System.out.println("---------------------------------------");
		Collections.sort(students, new HeightComparator());
		for(Student s:students) 
			System.out.println(s);
		
		System.out.println("---------------------------------------");
		Collections.sort(students, new NameComparator());
		for(Student s:students) 
			System.out.println(s);
	}

}
