package introjava;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Remove extra spaces at start/end
        str = str.trim();

        if(str.isEmpty()) {
            System.out.println("Total words: 0");
        } else {
            // Split by one or more spaces
            String[] words = str.split("\\s+");

            System.out.println("Total words: " + words.length);
        }

        sc.close();
    }
}
