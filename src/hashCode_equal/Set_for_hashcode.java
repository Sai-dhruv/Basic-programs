/**
 * 
 */
package hashCode_equal;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Sai Krishna
 *
 */
public class Set_for_hashcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setId(1);
		s2.setId(1);
	
		System.out.println(s1.equals(s2)); // it is false when we did not over ride equal and hash code
		
		Set<Student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		/*
		
		We are missing the second important method hashCode(). As java docs say,
		if we override equals() then we must override hashCode(). 
		So let’s add another method in our Employee class.
		
		*/
		System.out.println(set.size()); // it is showing 2 as size with out hash code
		
	}

}
