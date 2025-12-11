package ExceptionHandling;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c = 0;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
		System.out.println("Divided by zero has occured, please correct the code");
		}
		System.out.println("The value of c is :"+c);
	}

}
