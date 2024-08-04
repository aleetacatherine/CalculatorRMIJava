package calcuRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
	  public static void main(String[] args) {
		  try {
	            LocateRegistry.createRegistry(2099); // Start the RMI registry programmatically
	            Calculator calculator = new CalculatorImplementation();
	            Naming.rebind("rmi://localhost:2099/CalculatorService", calculator); // Bind the remote object
	            System.out.println("CalculatorService is running...");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}