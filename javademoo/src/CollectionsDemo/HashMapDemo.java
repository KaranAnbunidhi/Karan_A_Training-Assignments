package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap();// allows duplicates
		m1.put(100, "Arivu");
		m1.put(200, "Balan");
		m1.put(300, null);
		m1.put(200, "Balu");
		m1.put(400, "Arivu");
		m1.put(null, null);

		for (Map.Entry map : m1.entrySet())
			System.out.println("Key: " + map.getKey() + "\tValue: " + map.getValue());

	}

}
