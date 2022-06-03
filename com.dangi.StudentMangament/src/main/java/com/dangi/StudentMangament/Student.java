package com.dangi.StudentMangament;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tutionBalance=0;
	private static int costOfCourse= 1000;
	private static int id=1000;

	// constructor prompt user to enter name and year
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter Student Last Name: ");
		this.lastName=in.nextLine();
		
		System.out.println("Choose the respective option from 1,2,3,4 \n1 - 5th to 6th Grade \n2 - 7th to 8th Grade \n3 - 9th and 10th Grade \n4 - 11th and 12th Grade "
				+ "\nEnter Student Grade Year: ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
	}
	// generate an ID
	
	private void setStudentID() {
		// grade year+id
		id++;                     //tips         
		
		this.studentID= gradeYear+""+id;
				
	}
		
	// Enroll in courses 
	
	public void enroll() {
		do {
		System.out.print("Enter Course to Enroll (Q to quit) : ");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equalsIgnoreCase("Q")) {                     //tips
			courses=courses+"\n  "+course;
			tutionBalance=tutionBalance+costOfCourse;
		}
		else {
		break;	
		}
		}while(1!=0);		 
	}
	
	// view blanace 
	
	public void viewBalance() {
		System.out.println("Your Balance is : "+tutionBalance);
	}
	
	// pay tution fee
	public void payTution() {	
		
		viewBalance();
		System.out.println("Enter your payment : Rs");
		Scanner in=new Scanner(System.in);
		double payment=in.nextInt();
	
		tutionBalance=tutionBalance-(int)payment;
		System.out.println("Thank you for payment of Rs."+payment);
		viewBalance();
	}	
	
	// show status
	
	public String showStatus() {
		return "Name:  "+firstName+" "+lastName
				+"\nStudent ID: "+studentID
				+"\nCourse Enrolled: "+ courses+
				"\nBalance: Rs."+tutionBalance;
	}
}
