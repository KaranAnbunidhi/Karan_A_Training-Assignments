package introjava;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Using equals
        if (s1.equals(s2)) {
            System.out.println("Using equals(): Strings are EQUAL");
        } else {
            System.out.println("Using equals(): Strings are NOT equal");
        }

        // Using compareTo
        int result = s1.compareTo(s2);
        System.out.println("Using compareTo(): result = " + result);
        if (result == 0) {
            System.out.println("Strings are equal");
        } else if (result < 0) {
            System.out.println("First string is lexicographically smaller");
        } else {
            System.out.println("First string is lexicographically greater");
        }

        sc.close();
    }
}

