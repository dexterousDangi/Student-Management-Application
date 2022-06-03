package com.dangi.StudentMangament;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many new students you want to enroll;
		System.out.println("Enter the No. of New Students you want to enroll: ");
		Scanner in=new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student[] students= new Student[numOfStudents];
		
		for(int n=0;n<numOfStudents;n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].payTution();
			System.out.println(students[n].showStatus());
		}
	
	
		
		in.close();
	}

}
