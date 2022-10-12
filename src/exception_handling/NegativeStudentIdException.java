/**
 * 
 */
package exception_handling;

/**
 * @author Sai Krishna
 *
 */
public class NegativeStudentIdException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public NegativeStudentIdException(String message) {
		super(message);
	}
	

}
