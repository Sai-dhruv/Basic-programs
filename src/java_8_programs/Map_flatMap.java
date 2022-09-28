package java_8_programs;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Address;
import model.Data;
import model.Employee;

public class Map_flatMap {

	public static void main(String[] args) {

		
		Data data = new Data();
		
		List<Employee> list = data.data();
		
		list.stream().flatMap(e->e.getAddressList().stream()).map(Address::getPinCode).distinct().forEach(System.out::println);
		
		list.stream().flatMap(e->e.getAddressList().stream()).map(Address::getVillage).collect(Collectors.toList()).forEach(System.out::println);
		
		
		// skip first 4 elements
		list.stream().flatMap(p->p.getSkills().stream()).skip(4).distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
