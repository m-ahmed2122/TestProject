package com.Section15.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DesendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return Integer.compare(s1.getId(), s2.getId());
	}
	
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		Student s1 = new Student(1, "Obaid");
		Student s2 = new Student(25, "Abbas");
		Student s3 = new Student(10, "Salmaan");
		Student s4 = new Student(120, "Anas");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		System.out.println(students);
		
		Collections.sort(students);
		System.out.println("Desc" + students);
		
		//Collections.sort(students, new DesendingStudentComparator());
		
		students.sort( new DesendingStudentComparator());
		System.out.println("Asc" + students);
		
		
	}

}
