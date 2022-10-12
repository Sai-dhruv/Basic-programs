/**
 * 
 */
package hashCode_equal;

import java.util.Objects;

import exception_handling.NegativeStudentIdException;

/**
 * @author Sai Krishna
 *
 */
public class Student {
	
	private int id;
	private String name;
	private Double sal;
	
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0) {
			this.id = id;	
		}else {
			throw new NegativeStudentIdException("Student Id should not be negative");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(sal, other.sal);
	}
	
	

}
