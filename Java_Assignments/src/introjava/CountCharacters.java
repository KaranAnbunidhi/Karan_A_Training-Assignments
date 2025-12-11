package introjava;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int digits = 0, letters = 0, special = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                digits++;
            }
            else if(Character.isLetter(ch)) {
                letters++;
            }
            else if(!Character.isWhitespace(ch)) { // ignore spaces
                special++;
            }
        }

        System.out.println("\n--- Result ---");
        System.out.println("Alphabets: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);

        sc.close();
    }
}
