package CollectionsDemo;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Vector Elements: " + colors);

        colors.remove("Blue");
        System.out.println("After Removing 'Blue': " + colors);

        System.out.println("Element at index 1: " + colors.get(1));
    }
}
