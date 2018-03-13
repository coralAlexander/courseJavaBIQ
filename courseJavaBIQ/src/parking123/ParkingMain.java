package parking123;

public class ParkingMain {

	public static void main(String[] args) {
		Parking parking = new Parking();
		Car car = new Car(1, "Volvo", "2014", 4, 2);
        Truck truck = new Truck(2, "Fred", "2010", 8, 40000);
        Motorcycle motorcycle = new Motorcycle(2, "Honda", "2009", 2);
		parking.addVehicles(car);
		parking.addVehicles(truck);
		parking.addVehicles(motorcycle);
		
		
		parking.useVehicles();
		
		
	}

}
