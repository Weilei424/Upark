package parkingLot;

import Vehicle;

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

	public void park (Lot a, Vehicle) extends FullCapacityError{
		if (a.counter < a.cap){
			counter++;

		}
		else{
			throw new FullCapacityError("Lot is at full capacity");
		}
	}

	public void depark (Lot a){
		a.counter--;
	}


}

class FullCapacityError extends Exception{
	public FullCapacityError(String message){
		super(message);
	}
}
