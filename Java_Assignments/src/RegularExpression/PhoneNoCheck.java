package RegularExpression;

import java.util.Scanner;

public class PhoneNoCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char check;
		do {
			System.out.println("Enter Phone Number: ");
			String mobileNo = sc.next();
			String regex = "^(\\+\\d{1,3}|\\d{3})-\\d{3}-\\d{3}-\\d{4}$";
			if (mobileNo.matches(regex))
				System.out.println("Valid Number");
			else
				System.out.println("Invalid Number");

			System.out.print("Do you want to continue? (y/n): ");
			check = sc.next().charAt(0);
		} while (check != 'n');

	}
}
