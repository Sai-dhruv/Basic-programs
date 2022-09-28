package java_8_programs;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Match_allMatch_none {
	
	public static void main(String[] args) {
		
		int a[] = {1,3,4,2,5,7,4,7,12,45,50};
		
		
		Arrays.stream(a).asLongStream().forEach(k->System.out.print(k+" "));
		System.out.println("\n Array - > stream - > DoubleStream");
		Arrays.stream(a).asDoubleStream().forEach(k->System.out.print(k+" "));
		
		
		//predicate  anyMatch will return true/ false
		IntPredicate predicate = e->e%2==0;
		System.out.println("\n"+Arrays.stream(a).anyMatch(predicate));
		
		// All match example
		int allMatchArray[] = {10,20,50};
		boolean b = Arrays.stream(allMatchArray).allMatch(e->e%10 == 0);
		System.out.println(b);

		//Non match example
		int nonMatchArray[] = {1,2,4};
		boolean c = Arrays.stream(nonMatchArray).noneMatch(e->e%10 == 0);
		System.out.println("Non match out put >"+c);
		
	}

}
