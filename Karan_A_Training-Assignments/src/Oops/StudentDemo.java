package Oops;

import java.util.Scanner;

class Student {

	// Private variables (Secure Data)
	private String name;
	private int rollNo;
	private int marks;

	// Getter & Setter for Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter & Setter for Roll Number
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	// Getter & Setter for Marks with Validation
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("❌ Invalid Marks! Must be between 0 and 100.");
		}
	}
}

public class StudentDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student s = new Student();

		System.out.print("Enter Student Name: ");
		s.setName(sc.nextLine());

		System.out.print("Enter Roll Number: ");
		s.setRollNo(sc.nextInt());

		System.out.print("Enter Marks (0-100): ");
		s.setMarks(sc.nextInt());

		System.out.println("\n--- Student Details ---");
		System.out.println("Name     : " + s.getName());
		System.out.println("Roll No  : " + s.getRollNo());
		System.out.println("Marks    : " + s.getMarks());

		sc.close();
	}
}
