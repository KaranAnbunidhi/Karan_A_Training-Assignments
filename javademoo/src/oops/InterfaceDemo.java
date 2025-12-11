package oops;
class Printer implements Printable{
	public void print() {
		System.out.print(printerName+" is printing");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p1=new Printer();
		p1.print();

	}

}
