package oops;

import java.util.Scanner;

//Parent Class
class Person {
	String name;
	int age;

	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter age: ");
		age = sc.nextInt();
	}

	void displayDetails() {
		System.out.println("\n--- Person Details ---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

//Child Class (inherits Person)
class Student extends Person {
	String course;

	void inputCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter course: ");
		course = sc.nextLine();
	}

	void displayStudent() {
		displayDetails(); // calling parent method
		System.out.println("Course: " + course);
	}
}

//Main Class
public class InheritanceDemo {
	public static void main(String[] args) {

		Student s = new Student(); // object of child class

		s.inputDetails(); // inherited from Person
		s.inputCourse(); // own method

		s.displayStudent(); // display details
	}
}
