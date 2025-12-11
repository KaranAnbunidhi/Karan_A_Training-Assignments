package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList<>();
		l1.add(10); // not type safe and accessing index is not possible.
		l1.add("hello");
		for(Object obj:l1)
			System.out.println(obj);
		
	}

}
