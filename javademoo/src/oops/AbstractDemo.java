package oops;

abstract class MobilePhone{ //It may contain abstract method and object cannot be created.
	abstract void calling();
	void browsing() {
		System.out.println("Browsing in phone");
	}
}
class Iphone extends MobilePhone{
	void calling() {
		System.out.print("Iphone calling");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone phone=new Iphone();
		phone.browsing();
		phone.calling();

	}

}
