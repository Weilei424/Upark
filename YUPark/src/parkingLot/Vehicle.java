package parkingLot;

public class Vehicle {
	protected String make;
	protected String model;
	protected String color;
	protected int year;
	protected String plate;
	public boolean parked;
	
	private Vehicle() {
		this("", "", "", 0, "", false);
	}
	
	private Vehicle(String make, String model, String color, int year, String plate, boolean parked) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.plate = plate;
		this.parked = parked;
	}
	
	public static Vehicle getInstanceOf(String make, String model, String color, int year, String plate, boolean parked) {
		Vehicle v = new Vehicle(make, model, color, year, plate, parked);
		return v;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public boolean isParked() {
		return parked;
	}

	public void setParked(boolean parked) {
		this.parked = parked;
	}
	
}
