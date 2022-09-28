package java_8_programs;

import java.util.stream.Stream;

public class StreamWIthIterate {

	public static void main(String[] args) {
	Stream<Integer> si = Stream.iterate(1,n->n+2);
	 si.skip(10).limit(6).forEach(System.out::print);
	
	}

}
