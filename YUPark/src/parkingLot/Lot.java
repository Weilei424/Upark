package parkingLot;

public class Lot {
	protected String lotType;
	protected int lotNum;
	protected int cap;
	public String colour;
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

	public void park (Lot a, Vehicle v) {
		if (a.counter < a.cap){
			counter++;
			v.parked = true;
		}
		else{
			throw new FullCapacityError("Lot is at full capacity");
		}
	}

	public void depark (Lot a, Vehicle v){
		a.counter--;
		v.parked = false;
	}

	public String calculateCapacity (Lot a){
		if ((a.counter / a.cap) * 100 <= 25){
			return "Green";
		}
		else if ((a.counter / a.cap) * 100 >= 50 && (a.counter / a.cap) * 100 < 75){
			return "Yellow";
		}
		else if ((a.counter / a.cap) * 100 >= 75 && (a.counter / a.cap) * 100 < 100){
			return "Red";
		} else {
			return "Grey";
		}
	}
}

class FullCapacityError extends IllegalArgumentException{
	public FullCapacityError(String message){
		super(message);
	}
}
