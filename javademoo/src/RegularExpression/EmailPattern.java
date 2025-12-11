package RegularExpression;

import java.util.Scanner;

public class EmailPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char check;
		do {
			String email = sc.next();

			String regex = "^[a-z][a-z0-9-_+.]+@[a-z]+\\.[a-z]{2,7}$";

			if (email.matches(regex))
				System.out.println("Valid Email");
			else
				System.out.println("Invalid Email");

			System.out.print("Do you want to continue? (y/n):");
			check = sc.next().charAt(0);
		} while (check != 'n');

	}

}
