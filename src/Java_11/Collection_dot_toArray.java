package Java_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Collection_dot_toArray {

	public static void main(String[] args) {

		List<Integer> numbers = IntStream.of(2,1,3,4,5).boxed().collect(Collectors.toList());
		
		List<Integer> naturalNumbers = IntStream.range(1, 10).boxed().collect(Collectors.toList());
	
		/*	
		The toArray() method allocates a new in-memory array with a length equal to the size of the collection. 
		Internally, it invokes the Arrays.copyOf on the underlying array backing the collection. Therefore,
		the returned array has no references to it and is safe to use:
		*/
		
		
		Object []  naturalArray = naturalNumbers.toArray();
		
		System.out.println(Arrays.toString(naturalArray));
		
		
	}

}
