package ExceptionHandling;

public class ArrayOutOfBoundsDemo {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println("Array size: " + arr.length);
        try {
        	System.out.println(arr[3]); 
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.print("Array Index is Out of Bounds");
        }
    }
}
