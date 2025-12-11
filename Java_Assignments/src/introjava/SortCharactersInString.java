package introjava;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String sorted = new String(chars);
        System.out.println("Sorted characters: " + sorted);

        sc.close();
    }
}
