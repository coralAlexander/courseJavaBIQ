package Inheretence_parking123;

public abstract class Vehicle {
     protected int id ;
     protected String model ;
     protected String year;
     protected int  nunOfWheels ;
     
     public Vehicle(int id,String model,String year,int nunOfWheels) {
    	this.id=id;
    	this.model=model;
    	this.year=year;
    	this.nunOfWheels=nunOfWheels;
     }
     
    public void startDriving() {
    	System.out.println("Abstract vehicle cannot drive…");
    }

    public void stopDriving() {
    	System.out.println("Abstract vehicle cannot drive…”");
    }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getNunOfWheels() {
		return nunOfWheels;
	}

	public void setNunOfWheels(int nunOfWheels) {
		this.nunOfWheels = nunOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", model=" + model + ", year=" + year + ", nunOfWheels=" + nunOfWheels + "]";
	}

}
