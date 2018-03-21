package Inheretence_parking123;

public class Truck extends Vehicle {
     
	private int maxWeight ;
	
	public Truck(int id, String model, String year, int nunOfWheels,int maxWeight) {
		super(id, model, year, nunOfWheels);
		this.maxWeight=maxWeight;
	}

	public void detachTrailer() {
		System.out.println("Track detach Trailer");
	}
	public void attacheTrailer() {
		System.out.println("Track attache Trailer");
	}
	
	@Override
	public void startDriving() {
    	System.out.println("Car start driving");
    }
	@Override
    public void stopDriving() {
    	System.out.println("Car stop driving");
    }

	@Override
	public String toString() {
		return "Truck [maxWeight=" + maxWeight + "]";
	}
	
	
}
