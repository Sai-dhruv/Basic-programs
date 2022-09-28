package java_8_programs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import model.Data;
import model.Employee;

public class SortedExample {

	public static void main(String[] args) {

		
		Data data = new Data();
		List<Employee> list = data.data();
		
		Stream<String> skillStream = list.stream().flatMap(e->e.getSkills().stream());
		
		skillStream.sorted().forEach(System.out::println);
		
		Stream<String> skillStream1 = list.stream().flatMap(e->e.getSkills().stream());
		// Reverse Order 
		skillStream1.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		Employee employee_1 = data.data().get(0);
		Employee employee_2 = data.data().get(1);
		
		//(employee_1, employee_2) -> employee_1.getName().compareTo(employee_2.getName());
		
		Stream<String> skillStream2 = list.stream().flatMap(e->e.getSkills().stream());
		// Reverse Order 
		//skillStream2.sorted(Employee emp_1,Employee emp_2) -> employee_1.getName().compareTo(employee_2.getName())).forEach(System.out::println);
		
	}

}
