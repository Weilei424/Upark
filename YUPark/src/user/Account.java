package user;

import parkingLot.Lot;
import parkingLot.Vehicle;

public abstract class Account {
	protected int accNum;
	protected String status;
	String currentLot;
	Vehicle vehicleInfo;
	
	protected Account() {
		this(0, "", null);
	}
	
	protected Account(int accNum, String status, String currentLot) {
		this.accNum = accNum;
		this.status = status;
		this.currentLot = currentLot;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrentLot() {
		return currentLot;
	}

	public void setCurrentLot(String lot) {
		this.currentLot = lot;
	}
	
	
}
