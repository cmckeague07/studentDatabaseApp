package studentDataBaseApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int year;
	private String studentId;
	private String grade;
	ArrayList<String> courses = new ArrayList<>();
	private static double price= 600;
	private double balance; 
	private static int id = 1000;
	
	//Constructor prompt users student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter the student last name: ");
		this.lastName = in.nextLine();

		System.out.println("1 - Firstyear\n2 - Fifthyear\n3 - Finalyear ");
		this.year = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + year + " " + studentId);

	}
	//Generate an ID
	private void setStudentID() {
		//Grade level + static id
		id++;
		this.studentId = year + ""
				+ "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		
		do {
			System.out.println("Enter course to enrol (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses.add(course);
				this.balance = balance + price;
				
			}else {
			    break;}

			
			
		}while(1 !=0);
		
		System.out.println("Enrolled in: " + courses);
		System.out.println(balance);
		}
	
	
	public void viewBalance() {
		System.out.println("Your balance is :"+ balance);
	}
	
	
	public void payTuition() {
		System.out.println("Enter if you want to make a payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		balance = balance - payment;
		System.out.println("Thank you for you payment $" + payment);
		viewBalance();
		
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nCourses Enrolled: " + courses + "\nBalance:" + balance;
		
	}
	
}
