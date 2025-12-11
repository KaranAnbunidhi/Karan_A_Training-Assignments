package basicprgms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the search element: ");
		int key=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.print("Element found at "+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.print("Element not found");

	}

}
