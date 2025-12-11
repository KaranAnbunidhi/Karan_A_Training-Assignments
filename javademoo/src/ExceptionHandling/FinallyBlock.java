package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		int arr[]= {2,6,9,3};
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of boundary of array");
		}
		finally {
			System.out.println("All resources are closed");
		}

	}

}
