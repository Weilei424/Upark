package main;

import java.util.ArrayList;

import parkingLot.Lot;

public class Init {

	public static void main(String[] args) {
		ArrayList<Lot> lots = new ArrayList<Lot>();
		Controller controller = new Controller();
		
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
		ngn.setLotNum(105);
		ngn.setCap(70);
		lots.add(ngn);
		
		Lot ngs = new Lot("s");
		ngs.setLotNum(106);
		ngs.setCap(50);
		lots.add(ngs);
		
		Lot prs = new Lot("s");
		prs.setLotNum(89);
		prs.setCap(6);
		lots.add(prs);
		
		Lot tre = new Lot("s");
		tre.setLotNum(77);
		tre.setCap(6);
		lots.add(tre);
		
		Lot tr = new Lot("s");
		tr.setLotNum(79);
		tr.setCap(30);
		lots.add(tr);
		
		Lot vl = new Lot("s");
		vl.setLotNum(71);
		vl.setCap(50);
		lots.add(vl);
		
		Lot ar = new Lot("s");
		ar.setLotNum(67);
		ar.setCap(80);
		lots.add(ar);
		
		Lot cl = new Lot("s");
		cl.setLotNum(97);
		cl.setCap(30);
		lots.add(cl);
		
		Lot frw = new Lot("s");
		frw.setLotNum(65);
		frw.setCap(110);
		lots.add(frw);
		
		Lot ha = new Lot("s");
		ha.setLotNum(88);
		ha.setCap(76);
		lots.add(ha);
		
		Lot kl = new Lot("s");
		kl.setLotNum(87);
		kl.setCap(5);
		lots.add(kl);
		
		Lot ln = new Lot("s");
		ln.setLotNum(74);
		ln.setCap(8);
		lots.add(ln);
		
		Lot pc = new Lot("s");
		pc.setLotNum(91);
		pc.setCap(30);
		lots.add(pc);
		
		Lot nr = new Lot("s");
		nr.setLotNum(82);
		nr.setCap(40);
		lots.add(nr);
		
		Lot prn = new Lot("s");
		prn.setLotNum(85);
		prn.setCap(16);
		lots.add(prn);
		
		Lot pre = new Lot("s");
		pre.setLotNum(68);
		pre.setCap(44);
		lots.add(pre);
		
		Lot sh = new Lot("s");
		sh.setLotNum(63);
		sh.setCap(80);
		lots.add(sh);
		
		Lot tpr = new Lot("s");
		tpr.setLotNum(86);
		tpr.setCap(70);
		lots.add(tpr);
		
		Lot wob = new Lot("s");
		wob.setLotNum(78);
		wob.setCap(6);
		lots.add(wob);
		
		Lot yb = new Lot("s");
		yb.setLotNum(70);
		yb.setCap(140);
		lots.add(yb);
		
		
		
	}

}
