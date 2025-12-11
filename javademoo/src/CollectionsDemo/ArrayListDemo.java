package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("Anbu");
		list.add("Bala");
		list.add("Raju");
		list.add("Anbu");
		System.out.println("The list elements:");
		for(String string:list)
			System.out.println(string);
		
		list.add(2,"Dhamu");
		System.out.println("The list elements after updation:");
		for(String string:list)
			System.out.println(string);
		
		list.remove("Anbu");
		System.out.println("The list elements after deletion:");
		for(String string:list)
			System.out.println(string);

	}

}
