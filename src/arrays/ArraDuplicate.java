package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sai Krishna
 *
 */
public class ArraDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,3,4,5,6,7,7,8,5,3};
		for(int i=0;i<a.length;i++) {
			for(int j= i+1; j< a.length;j++) {
				if(a[i] == a[j]) {
					//System.out.print(a[i]);
				}
			}
		}
		
		Arrays.sort(a);
		System.out.println("\n");
		for(int i=0;i<a.length-1;i++) {
			if(a[i] == a[i+1]) {
				//System.out.print(a[i]);
			}
		}
		
		String[] b = {"1","3","4","5","6","7","7","8","5","3"};
		
		Stream<String> stream = Stream.of(b);
		
		Set<String> set = stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		               .entrySet().stream()
		               .filter(m->m.getValue() > 1)
		               .map(Map.Entry::getKey)
		               .collect(Collectors.toSet());
		 //  System.out.println(set);
		
		List<Integer> list
        = Arrays.asList(5, 13, 4,
                        21, 13, 27,
                        2, 59, 59, 34);
		   
		   
		 list.stream().filter(i->Collections.frequency(list, i)>0).collect(Collectors.toSet()).forEach(System.out::print);
		   
		   
		
		
	}
}
