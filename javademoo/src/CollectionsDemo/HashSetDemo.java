package CollectionsDemo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Float> set = new HashSet<>();

        System.out.print("Enter number of float values: ");
        int n = sc.nextInt();

        System.out.println("Enter float values:");
        for (int i = 0; i < n; i++) {
            float value = sc.nextFloat();
            set.add(value);
        }

        System.out.println("\nHashSet elements:");
        for (Float f : set) {
            System.out.println(f);
        }
        
        System.out.println("Enter value to be removed:");
        float item=sc.nextFloat();
        set.remove(item);
        System.out.println("After removing: ");
        for (Float f : set) {
            System.out.println(f);
        }
        

        sc.close();
    }
}
