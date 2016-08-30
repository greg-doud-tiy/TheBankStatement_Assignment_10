package ssa;

public class Savings extends Account {
	private double intRate;
	
	public double calcDepositInterest(int months) {
		double interest = this.getIntRate() / 12 * months * getBalance();
		this.deposit(interest);
		return interest;
	}
	public String print() {
		return String.format("%25s %9.2f", super.print(), this.getIntRate()*100);
	}
	public double getIntRate() {
		return intRate;
	}
	public void setIntRate(double intRate) {
		if(intRate >= 0) {
			this.intRate = intRate;
		}
	}
	
	public Savings() {
		this.setType('S');
	}
	public Savings(String description) {
		this();
		this.setDescription(description);
	}
}
