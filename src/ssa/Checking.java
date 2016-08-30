package ssa;

public class Checking extends Account {
	
	private static int lastCheckNbr = 99;
	
	public double withdraw(double amount) {
		int checkNbr = ++lastCheckNbr;
		return super.withdraw(amount);
	}
	public String print() {
		return String.format("%25s %3d", super.print(), this.getLastCheckNbr());
	}
	public int getLastCheckNbr() {
		return lastCheckNbr;
	}
	public Checking() {
		super();
		this.setType('C');
	}
	public Checking(String description) {
		this();
		this.setDescription(description);
	}
}
