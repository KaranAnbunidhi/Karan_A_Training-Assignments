package basicprgms;

class Product {
	String prodName;
	float price;

	Product() {
		prodName = "TV";
		price = 43330.34f;
	}

	Product(String prodName, float price) {
		this.prodName = prodName;
		this.price = price;
	}

	void displayProduct() {
		System.out.println("Product Name: " + prodName + "\t" + "Product Price: " + price);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();// no argument constructors
		p1.displayProduct();
		Product p2 = new Product("Mobile", 32000.23f);// with argument constructor
		p2.displayProduct();

	}

}
