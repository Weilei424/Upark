package parkingLot;

import java.util.Date;
import java.util.HashMap;

public class Rate {
	HashMap<String, Double> rateTable;
	
	public Rate(int lotNum) {
		rateTable = new HashMap<>();
		int day = new Date().getDay();
		
		if (day == 0 || day == 6) {
			this.rateTable.put("garage", 10.00);
		}
	}
	
	public static Rate getinstanceOf(int lotNum) {
		
		
		
		return rate;
	}
}
