/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Sai Krishna
 *
 */
public class Data {
	public List<Employee> data() {
		List<Address> aList = new ArrayList<>();
		List<Employee> eList = new ArrayList<>(); 
		Employee employee = new Employee();	
		employee.setFirstName("Vinjamuri");
		employee.setLastName("Saikrishna");
		employee.setId(1);
		employee.setGender('M');
		employee.setSal(132000.5);
		employee.setName("Saikrishna");
		State state = new State(1,"TG");
		Address address = new Address(1,"Sarapaka", 507128,state);
		aList.add(address);
		employee.setAddressList(aList);
		List<String> skillSet = new ArrayList<>();
		skillSet.add("Java");
		skillSet.add("DBMS");
		employee.setSkills(skillSet);
		eList.add(employee);
		
	    employee = new Employee();	
		employee.setId(2);
		employee.setGender('F');
		employee.setSal(132000.6);
		employee.setFirstName("Vinjamuri");
		employee.setLastName("Nihatika");
		employee.setName("Niharika");
		state = new State(1,"AP");
		address = new Address(1,"Gorrekunta", 507129,state);
		aList.add(address);
	     skillSet = new ArrayList<>();
		skillSet.add("DSA");
		skillSet.add("React");
		employee.setSkills(skillSet);
		employee.setAddressList(aList);
		eList.add(employee);
		
		
		employee = new Employee();	
		employee.setId(2);
		employee.setGender('M');
		employee.setFirstName("kar");
		employee.setLastName("smith");
		employee.setSal(1000.6);
		employee.setName("Smith");
		state = new State(10,"TX");
		address = new Address(1,"planno", 1234,state);
		aList.add(address);
		skillSet = new ArrayList<>();
		skillSet.add("Oracle");
		skillSet.add("cassandra");
		skillSet.add("Java");
		employee.setSkills(skillSet);
		employee.setAddressList(aList);
		eList.add(employee);
		
		
		
   		return eList;
	}
	
	public Employee getEmployee() {
		
		Employee employee = new Employee();	
		List<Address> aList = new ArrayList<>();
		List<Employee> eList = new ArrayList<>(); 
		employee.setId(1);
		employee.setGender('M');
		employee.setSal(132000.5);
		employee.setName("Saikrishna");
		State state = new State(1,"TG");
		Address address = new Address(1,"Sarapaka", 507128,state);
		aList.add(address);
		employee.setAddressList(aList);
		List<String> skillSet = new ArrayList<>();
		skillSet.add("Java");
		skillSet.add("DBMS");
		employee.setSkills(skillSet);
		return employee;
		
	}
	

}
