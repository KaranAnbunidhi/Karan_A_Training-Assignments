package introjava;

import java.util.Scanner;

public class LeftRotateArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter number of positions to rotate: ");
		int d = sc.nextInt();

		// If d > n, reduce rotations
		d = d % n;

		int[] result = new int[n];
		int index = 0;

		// Copy elements from d to end
		for (int i = d; i < n; i++) {
			result[index++] = arr[i];
		}

		// Copy first d elements
		for (int i = 0; i < d; i++) {
			result[index++] = arr[i];
		}

		System.out.print("\nArray after left rotation: ");
		for (int num : result) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}
