package java_8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Avg_findAny_findFirst_max_min_reduce {

	public static void main(String[] args) {

		int a[] = {12,1,31,43,25,12,10,34,13};
		// Stream of array of integers
		//Stream<int[]> st = Stream.of(a);


		OptionalDouble avgEx = Arrays.stream(a).average();
		System.out.println("Average example  -> Return  :"+avgEx);
		System.out.println(" as Double "+avgEx.getAsDouble());


		// Find any example
		OptionalInt findAnyExample = Arrays.stream(a).findAny();
		System.out.println(findAnyExample);
		System.out.println("Int value 		:	"+findAnyExample.getAsInt());
		System.out.println("FInd First      :  	"+Arrays.stream(a).findFirst());
		System.out.println("Max values 		:  	"+Arrays.stream(a).max());
		System.out.println("Min values 		:  	"+Arrays.stream(a).min());
		System.out.println(Arrays.stream(a).reduce((x,y)->x+y));

		List<String> list = Arrays.asList("https://","online","Banking");
		Stream<String> streamofString = list.stream();



	}

}
