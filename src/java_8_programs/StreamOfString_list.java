package java_8_programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfString_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream<String> streamOfString = Stream.of("sai","krishna","Ram","Rajesh");
		
		List<String> stringList = streamOfString.collect(Collectors.toList());
		
		System.out.println(stringList);
		
		Stream<String> streamOfStringEx = Stream.of("sai","skrishna","sRam","sRajesh");
		boolean b = streamOfStringEx.allMatch(e->e.startsWith("s"));
		System.out.println(b);
		
		

	}

}
