package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {

		// filter() to filter only even numbers
		System.out.println("filter()");
		List<Integer> list = Arrays.asList(3, 6, 9, 1, 34, 5, 7, 12);
		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

		// map() to transform a number into another form of number
		System.out.println("map()");
		list.stream().map(num -> (num * num) + " is a square of " + num).forEach(num -> System.out.println(num));

		// reduce() to reduce into single number
		System.out.println("reduce()");
		int sumOfNumbers = list.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sumOfNumbers);
		
		
		// sorted() to sort the list
		System.out.println("sorted()");
		list.stream().sorted().forEach(num->System.out.print(num+" "));
	}

}
