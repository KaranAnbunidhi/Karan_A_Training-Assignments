package basicprgms;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Selenium";
		s1=s1+" Training";// immutable-new memory location is allocated while making changes to the string.
		System.out.println(s1);
		String str="java";
		String str2="java";
		System.out.println(str==str2);
		System.out.println(str.equals("Java"));
		System.out.println(str.compareTo("Java"));
		String result=String.join(" ","java","programming");
		System.out.println(result);
		String data = "Apple,Banana,Orange,Mango";

        String fruits[] = data.split(",");

        System.out.println("Fruits:");
        for(String f : fruits) {
            System.out.println(f);
        }
        
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int freq[]=new int[256];
        
        for(int val:freq) {
        	freq[word.charAt(val)]++;
        }
        
        for(int i=0;i<256;i++) {
        	if(freq[i]>0)
        		System.out.println((char)i+"->"+freq[i]);
        }
        
	}

}
