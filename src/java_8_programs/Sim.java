/**
 * 
 */
package java_8_programs;

import java.io.IOException;

/**
 * @author Sai Krishna
 *
 */
public interface Sim {
	
	public static final int cost = 10;
	
	void messageService() throws IOException;
	void callService();
    static Boolean isSignal() {
    	System.out.println(" isSignal from SIM interface ...!");
    	return true;
	}
    default int internetService() {
    	System.out.println(" Internet service from SIM interface..!");
    	return 5;
    }
}
