package Oops;

import java.util.Scanner;

//Parent Class
class BankAccount {

	int accountNo;
	double balance;

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Amount deposited: " + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Amount withdrawn: " + amount);
		} else {
			System.out.println("❌ Insufficient Balance!");
		}
	}

	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}
}

//Subclass #1
class SavingsAccount extends BankAccount {

	double interestRate;

	public void addInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest added: " + interest);
	}
}

//Subclass #2
class SalaryAccount extends BankAccount {

	double monthlySalary;

	public void creditSalary() {
		balance += monthlySalary;
		System.out.println("Salary Credited: " + monthlySalary);
	}
}

public class BankDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--- Select Account Type ---");
		System.out.println("1. Savings Account");
		System.out.println("2. Salary Account");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		BankAccount account;

		if (choice == 1) {
			SavingsAccount sa = new SavingsAccount();

			System.out.print("Enter Account Number: ");
			sa.accountNo = sc.nextInt();

			System.out.print("Enter Interest Rate (%): ");
			sa.interestRate = sc.nextDouble();

			sa.deposit(5000);
			sa.addInterest();
			sa.withdraw(2000);

			account = sa;

		} else {
			SalaryAccount sal = new SalaryAccount();

			System.out.print("Enter Account Number: ");
			sal.accountNo = sc.nextInt();

			System.out.print("Enter Monthly Salary: ");
			sal.monthlySalary = sc.nextDouble();

			sal.creditSalary();
			sal.withdraw(1000);

			account = sal;
		}

		System.out.println("\n--- Final Account Status ---");
		account.displayBalance();

		sc.close();
	}
}
