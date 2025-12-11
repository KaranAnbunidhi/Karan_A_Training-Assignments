package introjava;

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestSmallest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // Sort array

		System.out.println("\nSorted Array: " + Arrays.toString(arr));

		int secondSmallest = -1;
		int secondLargest = -1;

		// Find second smallest
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[0]) {
				secondSmallest = arr[i];
				break;
			}
		}

		// Find second largest
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != arr[n - 1]) {
				secondLargest = arr[i];
				break;
			}
		}

		System.out.println("Second Smallest: " + (secondSmallest == -1 ? "Not available" : secondSmallest));
		System.out.println("Second Largest: " + (secondLargest == -1 ? "Not available" : secondLargest));

		sc.close();
	}
}
