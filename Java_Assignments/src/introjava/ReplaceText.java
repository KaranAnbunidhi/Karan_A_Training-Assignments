package introjava;

import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String str = sc.nextLine();

        System.out.print("Enter the text to replace (character or word): ");
        String oldText = sc.nextLine();

        System.out.print("Enter the new text: ");
        String newText = sc.nextLine();

        String result = str.replace(oldText, newText);

        System.out.println("\n--- Result ---");
        System.out.println("Original: " + str);
        System.out.println("Modified: " + result);

        sc.close();
    }
}

