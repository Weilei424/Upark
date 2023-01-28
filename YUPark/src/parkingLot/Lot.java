package parkingLot;

public class Lot {
	protected String lotType;
	protected int lotNum;
	protected int cap;
	public int counter;
	
	public Lot() {
		
	}
	
	public Lot(String lotType) {
		this.lotType = lotType;
		this.cap = 0;
		this.counter = 0;
	}
	
	public String getLotType() {
		return lotType;
	}

	public int getLotNum() {
		return lotNum;
	}
	
	public void setLotNum(int lotNum) {
		this.lotNum = lotNum;
	}
	
	public int getCap() {
		return cap;
	}	
	
	public void setCap(int cap) {
		this.cap = cap;
	}
}
