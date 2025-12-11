package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> list=new TreeSet<>();// no duplicates and sorted automatically
		list.add("Anbu");
		list.add("Bala");
		list.add("Raju");
		list.add("Anbu");
		System.out.println("The list elements:");
		for(String string:list)
			System.out.println(string);
		
		list.add("Dhamu");
		System.out.println("The list elements after updation:");
		for(String string:list)
			System.out.println(string);
		
		list.remove("Anbu");
		System.out.println("The list elements after deletion:");
		for(String string:list)
			System.out.println(string);

	}

}
