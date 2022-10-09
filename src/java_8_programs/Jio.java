/**
 * 
 */
package java_8_programs;

/**
 * @author Sai Krishna
 *
 */
public class Jio implements Sim{

	@Override
	public void messageService() {
		System.out.println("message sevice from JIO ....!");
		
	}

	@Override
	public void callService() {
		System.out.println("Call service from JIO ....!");
	}
	public void getJioSimCost() {
		System.out.println("Jio Sim cost :"+cost);
	}

}
