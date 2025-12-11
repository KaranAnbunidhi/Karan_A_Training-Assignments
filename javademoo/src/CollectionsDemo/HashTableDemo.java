package CollectionsDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new Hashtable();// allows duplicates and doesn't allow null values
		m1.put(100, "Arivu");
		m1.put(200, "Balan");
		m1.put(200, "Balu");
		m1.put(400, "Arivu");

		for (Map.Entry map : m1.entrySet())
			System.out.println("Key: " + map.getKey() + "\tValue: " + map.getValue());

	}

}
