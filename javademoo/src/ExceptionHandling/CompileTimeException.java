package ExceptionHandling;

import java.io.FileInputStream;

public class CompileTimeException {

	public static void main(String[] args) {
		String filename="c:\\test.txt";
		FileInputStream fis=new FileInputStream(filename);// this the compile time exception

	}

}
