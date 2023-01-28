package user;

import parkingLot.Vehicle;

public abstract class UniversityUser extends Account {
	protected String name;
	protected int id;
	public static int accNumGenerator = 100000;
	protected Vehicle vehicleInfo;
	protected String paymentType;
	
	protected UniversityUser() {
		super();
		accNum = accNumGenerator++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicle getVehicleInfo() {
		return vehicleInfo;
	}

	public void setVehicleInfo(Vehicle vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
}
