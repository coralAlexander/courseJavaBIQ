package Inheretence_parking123;

import java.util.Arrays;

public class Parking {

	private Car car ;
	private Motorcycle motocycle;
	private Truck truck ;
	
	Vehicle[] vehicles = new Vehicle[10];
	
	public void addVehicles(Vehicle vehicle) {
		boolean ifFull = false;
		for (int i = 0; i < vehicles.length; i++) {
		   if (vehicles[i] == null) {
			   vehicles[i]=vehicle;
			   ifFull=false;
			   break;
		   }
		   else {
			   ifFull=true;
			   continue;
		   }
		}
		if(ifFull==true) {
			System.out.println("Parking is full !!!!!!!");
		}
	}
	
	public void deleteByIndex(int index) {
		vehicles[index]=null;
	}
	
	public void useVehicles() {
		for (Vehicle vehicle : vehicles) {
			
		}
		
	}

	@Override
	public String toString() {
		return "Parking [car=" + car + ", motocycle=" + motocycle + ", truck=" + truck + ", vehicles="
				+ Arrays.toString(vehicles) + "]";
	}
}
