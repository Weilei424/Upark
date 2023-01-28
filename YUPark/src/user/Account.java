package user;

import parkingLot.Lot;

public abstract class Account {
	protected int accNum;
	protected String status;
	protected Lot currentLot;
	
	protected Account() {
		this(0, "", null);
	}
	
	protected Account(int accNum, String status, Lot currentLot) {
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

	public Lot getCurrentLot() {
		return currentLot;
	}

	public void setCurrentLot(Lot currentLot) {
		this.currentLot = currentLot;
	}
	
	
}
