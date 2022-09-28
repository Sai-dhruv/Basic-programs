package java_8_programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_conversions {

	public static void main(String[] args) {

		// Integer Object format
		List<Integer> intStream = IntStream.of(1,2,3,41,3).boxed().collect(Collectors.toList());
		System.out.println(intStream);
		List<Integer> IntegerStream = IntStream.of(2,4,1,56,12).mapToObj(Integer::valueOf).collect(Collectors.toList());
		System.out.println(IntegerStream);

		
		
	}

}
