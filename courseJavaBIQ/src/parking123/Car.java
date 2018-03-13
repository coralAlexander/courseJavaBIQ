package parking123;

public class Car extends Vehicle {

	private int numberOfDoors;
	
	public Car(int id, String model, String year, int nunOfWheels,int numberOfDoors) {
		super(id, model, year, nunOfWheels);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void useWipers() {
		System.out.println("Using the wipers");
	}

	@Override
	public void startDriving() {
    	System.out.println("Car start driving");
    }
	@Override
    public void stopDriving() {
    	System.out.println("Car stop driving");
    }

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Car [numberOfDoors=" + numberOfDoors + "]";
	}
	
	
}