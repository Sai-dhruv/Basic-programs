package java_8_programs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Data;
import model.Employee;

public class MultipleSorts {

	public static void main(String[] args) {
		
		Data data = new Data();
		List<Employee> list = data.data();
		Employee employee = data.getEmployee();
		//Comparator<Employee> byName = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
		Comparator<Employee> byLastName  = Comparator.comparing(Employee::getSal);
		
		
		List<Employee> sortedList = list.stream().sorted(byLastName).collect(Collectors.toList());
		sortedList.stream().map(e->e.getName()).forEach(System.out::println);
		
		
		
	}

}
