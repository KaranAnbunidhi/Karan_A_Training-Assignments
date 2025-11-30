package introjava;

import java.util.Scanner;

public class SubstringOccurance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to count: ");
        String sub = sc.nextLine();

        int originalLength = str.length();

        // Remove all occurrences of substring
        String modified = str.replace(sub, "");

        int newLength = modified.length();

        // Each removed substring reduces length by sub.length()
        int count = (originalLength - newLength) / sub.length();

        System.out.println("\nOccurrences: " + count);

        sc.close();
    }
}
