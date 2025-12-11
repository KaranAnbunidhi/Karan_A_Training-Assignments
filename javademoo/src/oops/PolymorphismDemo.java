package oops;

import java.util.Scanner;

//Parent Class
class Employee {
	String name;
	double salary;

	// Method Overloading (Compile-time Polymorphism)
	void setDetails(String name) {
		this.name = name;
		this.salary = 30000; // default salary
	}

	void setDetails(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	void displayDetails() {
		System.out.println("\n--- Employee Information ---");
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	// Overridable method
	void work() {
		System.out.println("Employee works");
	}
}

//Child Class 1
class Developer extends Employee {
	// Method overriding (Runtime Polymorphism)
	@Override
	void work() {
		System.out.println("Developer writes code");
	}
}

//Child Class 2
class Manager extends Employee {
	@Override
	void work() {
		System.out.println("Manager manages the team");
	}
}

//Main Class
public class PolymorphismDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nSelect Employee Type:");
		System.out.println("1. Developer");
		System.out.println("2. Manager");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		sc.nextLine(); // clear buffer

		Employee emp; // Parent reference

		if (choice == 1)
			emp = new Developer();
		else
			emp = new Manager();

		System.out.print("Enter employee name: ");
		String name = sc.nextLine();

		System.out.print("Do you want to enter salary? (yes/no): ");
		String option = sc.nextLine();

		if (option.equalsIgnoreCase("yes")) {
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			emp.setDetails(name, salary); // calls overloaded method
		} else {
			emp.setDetails(name); // calls overloaded method
		}

		emp.displayDetails();
		emp.work(); // overridden method (Runtime Polymorphism)
	}
}
