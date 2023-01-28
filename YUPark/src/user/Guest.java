package user;

public class Guest extends Account{
	public static int accNumGenerator = 1000000;
	
	public Guest() {
		this.accNum = accNumGenerator++;
	}
}
