package basicprgms;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l1=9875543327l;
		int i1=(int) l1;
		System.out.println("long to int: "+i1);
		
		float floatnum=3.14f;
		long longnum=(long)floatnum;
		System.out.println("float to long: "+longnum);
		
		char ch='a';
		int num=ch;// ascii value. Automatic typecasting-implicit
		System.out.println(num);
		
		int number=100;
		char val=(char) number;
		System.out.println(val);
		
	}

}
