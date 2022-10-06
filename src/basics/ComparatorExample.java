/**
 * 
 */
package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Student;

/**
 * @author Sai Krishna
 *
 */


public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "Mayank", "london"));
		ar.add(new Student(131, "Anshul", "nyc"));
		ar.add(new Student(121, "Solanki", "jaipur"));
		ar.add(new Student(101, "Aggarwal", "Hongkong"));

		System.out.println("=================Unsorted ===========");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getName());
		}

		System.out.println("==============Sorted =================");
		Collections.sort(ar,new NameComparator());

		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getName());
		}

		System.out.println("==============Sorted By Roll Number =================");
		Collections.sort(ar,new RollNumberComparator());

		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getName());
		}

	}
}

class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}


class RollNumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNumber() - o2.getRollNumber();			
	}

}
