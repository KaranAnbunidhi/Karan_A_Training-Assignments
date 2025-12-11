package ExceptionHandling;

public class ThrowException {

	public static void main(String[] args) {
		int a = 10, b = 2, c = 0;
		try {
			c = a / b;
			throw new ArrayIndexOutOfBoundsException();
		}

		catch (ArithmeticException e) {
			System.out.println("Divided by zero has occured, please correct the code");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The value of c is :" + c);

	}

}
