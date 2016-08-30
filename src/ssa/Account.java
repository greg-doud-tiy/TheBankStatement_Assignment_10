package ssa;

public class Account {
	private static int lastId = 100;
	private int id;
	private String description;
	private double balance;
	private char type;
	
	public double deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
		return this.getBalance();
	}
	public double withdraw(double amount) {
		if(amount > 0 && amount <= this.getBalance()) {
			this.setBalance(this.getBalance() - amount);
		}
		return this.getBalance();
	}
	public double transferFrom(Account fromAccount, double amount) {
		if(amount > 0 && amount <= fromAccount.getBalance()) {
			fromAccount.withdraw(amount);
			this.deposit(amount);
		}
		return this.getBalance();
	}
	public String print() {
		return String.format("%c %3d %-25s %9.2f", this.getType(), this.getId()
				, this.getDescription(), this.getBalance());
	}
	
	public char getType() {
		return type;
	}
	protected void setType(char type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account() {
		this.setId(lastId+=10);
		this.setDescription("New Account");
		this.setBalance(0.0);
		this.type = 'A';
	}
	public Account(String description) {
		this();
		this.setDescription(description);
	}
}
