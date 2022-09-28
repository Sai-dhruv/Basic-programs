package java_8_programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationExamples {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("sai","sairam","krishna","Rajesh","sai");
		
		stringStream.filter(e->e.startsWith("s")).forEach(k->System.out.print(k));
		
		Stream<String> stringStream1 = Stream.of("sai","sairam","krishna","Rajesh","sai");
		
		stringStream1.distinct().forEach(System.out::print);
		
		
		
		
		
	}

}
