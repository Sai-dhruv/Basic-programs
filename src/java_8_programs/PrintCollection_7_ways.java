package java_8_programs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sai Krishna
 *
 */
public class PrintCollection_7_ways {

	public static void main(String[] args) {

		String countries[] = {"USA","UK","INDIA"};

		List<String> countriString = Arrays.asList(countries);

		List<String> listOfMethod = List.of(countries);

		System.out.println("--------- Using Traditional For Loop -------");
		for(int i=0;i<countriString.size();i++){
			System.out.println(countriString.get(i));
		}

		System.out.println("*** Using For each Loop ***");
		for(String country : listOfMethod) {
			System.out.println(country);
		}
		
        System.out.println("***  Using Iterator *****"); 
		Iterator<String> itr = countriString.iterator();
		
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		System.out.println("---- Using Lambda ------");
		listOfMethod.forEach(item->System.out.println(item));
		
		System.out.println("----- Method Reference ---- ");
		listOfMethod.forEach(System.out::println);
		
		System.out.println("------ Using forEach streams --------");
		listOfMethod.stream().forEach(a->System.out.println(a));
	}
}
