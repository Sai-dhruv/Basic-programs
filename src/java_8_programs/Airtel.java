/**
 * 
 */
package java_8_programs;

/**
 * @author Sai Krishna
 *
 */
public class Airtel implements Sim{

	int cost = 20;
	
	@Override
	public void messageService() {
		System.out.println("From AirTel Message Service....!");
		
	}

	@Override
	public void callService() {
		System.out.println("From AirTel Call service ....!");
		
	}
	
	public int internetService() {
		System.out.println("Internet service from AirTel...!");
		return 4;
	}
	
	public void getAirTelSimCost() {
		System.out.println("AirTel Sim cost :"+cost);
	}

}
