package main;

import java.io.*;
import java.util.*;
import user.*;
import parkingLot.*;

public class Controller {
	Scanner s1;
	Account user;
	
	/**
	 * This arrayList should be storing Strings in following format:
	 * index 0: accountType ("staff/student/guest")
	 * index 1: accountNum ("")
	 * index 2: paymentType 
	 * index 3: vehicle 
	 * index 4: lotNum
	 */
	ArrayList<String> input;
	
	public Controller() {
		
	}
	
	public Controller(File st) {
		try {
			this.s1 = new Scanner(st);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.input = new ArrayList<>();
		while (s1.hasNextLine()) {
			this.input.add(s1.nextLine());
		}
		s1.close();
		this.user = this.infoDispatch();
		this.user.setCurrentLot(this.input.get(4));
		this.user.setAccNum(Integer.parseInt(this.input.get(1)));
	}
	
	private Account infoDispatch() {
		switch (this.input.get(0)) {
		case "staff":
			return new Staff();
		case "student":
			return new Student();
		case "guest":
			return new Guest();
		}
		return null;
	}
}
