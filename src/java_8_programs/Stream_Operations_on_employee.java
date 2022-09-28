package java_8_programs;

import java.util.List;
import java.util.stream.Collectors;

import model.Data;
import model.Employee;

public class Stream_Operations_on_employee {


	public static void main(String[] args) {

		Data data = new Data();
		List<Employee> eList = data.data();

		List<Employee> nameStartWithSai = eList.stream().filter(e->e.getId()==1).collect(Collectors.toList());
		nameStartWithSai.stream().forEach(e->System.out.println(e.getName()));

		// smith salary 
		eList.stream().filter(e->e.getSal()<11000)
		.collect(Collectors.toList()).forEach(l->System.out.print(l.getName()));


		// Only salary List  from  emplist
		List<Double> dList = eList.stream().map(Employee::getSal).collect(Collectors.toList());
		System.out.print(dList);


		//Total employees sal
		Double totalSal = eList.stream().collect(Collectors.summarizingDouble(Employee::getSal)).getSum();
		System.out.println("Total sal "+totalSal);


		// sorting by name







	}

}
