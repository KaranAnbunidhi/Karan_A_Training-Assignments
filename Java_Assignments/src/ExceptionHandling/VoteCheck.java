package ExceptionHandling;

import java.util.Scanner;

public class VoteCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new Exception("Candidate is not eligible to vote");
			} else {
				System.out.println("Candidate is eligible to vote");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
