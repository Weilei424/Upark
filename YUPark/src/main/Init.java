package main;

import java.util.ArrayList;

import parkingLot.Lot;

public class Init {

	public static void main(String[] args) {
		ArrayList<Lot> lots = new ArrayList<Lot>();
		Lot apg = new Lot("g");
		apg.setLotNum(80);
		apg.setCap(400);
		lots.add(apg);
		
		Lot spg = new Lot("g");
		spg.setLotNum(84);
		spg.setCap(600);
		lots.add(spg);
		
		Lot ypg = new Lot("g");
		ypg.setLotNum(72);
		ypg.setCap(400);
		lots.add(ypg);
		
		Lot atk = new Lot("s");
		atk.setLotNum(83);
		atk.setCap(25);
		lots.add(atk);
		
		Lot cal = new Lot("s");
		cal.setLotNum(107);
		cal.setCap(8);
		lots.add(cal);
		
		Lot fre = new Lot("s");
		fre.setLotNum(66);
		fre.setCap(175);
		lots.add(fre);
		
		Lot lum = new Lot("s");
		lum.setLotNum(73);
		lum.setCap(25);
		lots.add(lum);
		
		Lot nel = new Lot("s");
		nel.setLotNum(82);
		nel.setCap(60);
		lots.add(nel);
		
		Lot ng = new Lot("s");
		ng.setLotNum(64);
		ng.setCap(70);
		lots.add(ng);
		
		Lot ngn = new Lot("s");
		ngn.setLotNum(84);
		ngn.setCap(600);
		lots.add(ngn);
		
		Lot apg = new Lot("APG");
		apg.setLotNum(80);
		apg.setCap(400);
		lots.add(apg);
		
		Lot spg = new Lot("SPG");
		spg.setLotNum(84);
		spg.setCap(600);
		lots.add(spg);
		
		Lot apg = new Lot("APG");
		apg.setLotNum(80);
		apg.setCap(400);
		lots.add(apg);
		
		Lot spg = new Lot("SPG");
		spg.setLotNum(84);
		spg.setCap(600);
		lots.add(spg);
		
		
		
	}

}
