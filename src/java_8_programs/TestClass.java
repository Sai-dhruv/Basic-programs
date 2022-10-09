/**
 * 
 */
package java_8_programs;

/**
 * @author Sai Krishna
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Sim airTelSim = new Airtel();
		airTelSim.callService();

		// implemented default method in AirTel
		int iService = airTelSim.internetService();
		System.out.println(iService);

		// static method calling 
		Sim.isSignal();
		
		//variable
		Airtel airtel = new Airtel();
        airtel.getAirTelSimCost();
		

		// Not implemented in Jio so printed from interface
		Sim jioService = new Jio();
		jioService.internetService();
		jioService.callService();
		
		// jio object
		Jio jio = new Jio();
		jio.getJioSimCost();
		
		
		
		
		
		
       		
		
		
		

	}

}
