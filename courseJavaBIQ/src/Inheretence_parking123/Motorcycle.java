package Inheretence_parking123;

public class Motorcycle extends Vehicle {

	public Motorcycle(int id, String model, String year, int nunOfWheels) {
		super(id, model, year, nunOfWheels);	
	}
	
	public void driveOnOneWeel() {
	 System.out.println("Motorcycle drive On OneWeel");	
	}
	
	@Override
	public void startDriving() {
    	System.out.println("Car start driving");
    }
	@Override
    public void stopDriving() {
    	System.out.println("Car stop driving");
    }
	
}
