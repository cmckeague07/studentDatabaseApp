package studentDataBaseApp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Ask the user how many students we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for(int n =0; n<numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
			
		}
		for(int n =0; n<numOfStudents; n++) {
			System.out.println(students[n].toString());
			
		}
	}

}