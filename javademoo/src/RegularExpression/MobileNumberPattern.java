package RegularExpression;

import java.util.Scanner;

public class MobileNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char check;
		do {
			String mobileNo = sc.next();

			String regex = "^(\\+91|0)?[6-9]\\d{9}";
			if (mobileNo.matches(regex))
				System.out.println("Valid Number");
			else
				System.out.println("Invalid Number");

			System.out.print("Do you want to continue? (y/n):");
			check = sc.next().charAt(0);
		} while (check != 'n');

	}

}
