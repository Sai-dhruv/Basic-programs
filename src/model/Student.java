/**
 * 
 */
package model;

import java.util.Objects;

/**
 * @author Sai Krishna
 *
 */
public class Student {
	
	private int rollNumber;
	private String name;
	private String section;

	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	/**
	 * @param rollNumber
	 * @param name
	 * @param section
	 */
	public Student(int rollNumber, String name, String section) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.section = section;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber, section);
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
		return Objects.equals(name, other.name) && rollNumber == other.rollNumber
				&& Objects.equals(section, other.section);
	}

}
