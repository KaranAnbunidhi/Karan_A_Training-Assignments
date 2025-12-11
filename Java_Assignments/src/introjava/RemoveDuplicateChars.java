package introjava;

import java.util.Scanner;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean[] seen = new boolean[256];
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);

	}

}
