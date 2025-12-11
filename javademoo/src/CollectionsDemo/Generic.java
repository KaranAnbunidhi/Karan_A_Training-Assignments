package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("hi");
		list.add("hello");
		for(String val:list) {
			System.out.println(val);
		}
		
	}

}
