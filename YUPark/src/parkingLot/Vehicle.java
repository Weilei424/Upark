package parkingLot;

public class Vehicle {
	protected String make;
	protected String model;
	protected String color;
	protected int year;
	protected String plate;
	
	private Vehicle() {
		this("", "", "", 0, "");
	}
	
	private Vehicle(String make, String model, String color, int year, String plate) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.plate = plate;
	}
	
	public static Vehicle getInstanceOf(String make, String model, String color, int year, String plate) {
		Vehicle v = new Vehicle(make, model, color, year, plate);
		return v;
	}
	
}
