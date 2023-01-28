package parkingLot;

import java.util.Date;
import java.util.HashMap;

public class Rate {
	HashMap<String, Double> rateTable;
	private final String DAILY = "d";
	private final String HOURLY = "h";
	private String payBy;
	private String lotType;
	
	public Rate(String payBy, String lotType) {
		this.payBy = payBy;
		this.lotType = lotType;
		this.rateTable = new HashMap<>();
		this.rateTable.put("garagehr", 5.00);
		this.rateTable.put("garageday", 7.00);
		this.rateTable.put("surfacehr", 2.50);
		this.rateTable.put("surfaceday", 5.00);
		
	}
	
	public double getRate(String payBy) {
		if (!(payBy.equals(DAILY) | payBy.equals(HOURLY))) 
			throw new IllegalArgumentException("Unsupported payment type");
		int day = new Date().getDay();
		if (day == 0 || day == 6) {
			payBy = DAILY;
		}
		if (payBy == DAILY) {
			return lotType.equals("g") ? this.rateTable.get("garageday") : this.rateTable.get("surfaceday");
		} else {
			return lotType.equals("g") ? this.rateTable.get("garagehr") : this.rateTable.get("surfacehr");
		}
	}
}
