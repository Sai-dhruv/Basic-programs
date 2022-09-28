package java_8_programs;

import java.util.Random;
import java.util.stream.Stream;

public class InFiniteStream_supply {

	public static void main(String[] args) {

		Random random = new Random();
		// we used supplier here
		Stream<Integer> infinite = Stream.generate(() -> {
			return random.nextInt(100);
		}).limit(6);
		infinite.forEach(System.out::println);
		
		
		
		Stream<Double> randomValue = Stream.generate(()->{
			return random.nextDouble(10);
		}).limit(2);
		randomValue.forEach(System.out::print);

	}

}
