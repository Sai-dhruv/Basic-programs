package exception_handling;

import java.util.Scanner;

public class InvalidAgeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String s) {
		super(s);
	}
	public static void main(String[] args) {

		try(Scanner scanner = new Scanner(System.in)) {
			int age = scanner.nextInt();
			if(age < 0) {
				throw new InvalidAgeException("Please do not enter negative age");
			}
			if(age < 12) {
				throw new InvalidAgeException("Not eligible for marriage ");
			}
			System.out.println("perfect Age");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
