package ssa;

import java.util.ArrayList;

public class Mainline {

	public static void main(String[] args) {
		Account a = new Account("Account A");
		a.deposit(100.00);
		a.withdraw(50.00);
		//
		Account b = new Account("Account B");
		b.deposit(100.00);
		b.withdraw(75.00);
		b.withdraw(50.00);
		b.deposit(10.00);
		//
		Savings c = new Savings("Savings C");
		c.setIntRate(0.025);
		c.deposit(500.00);
		//
		Checking d = new Checking("Checking D");
		d.deposit(500.00);
		d.withdraw(100.00);
		// 
		ArrayList<Account> accounts = new ArrayList<Account>();
		System.out.println("T Act Description                  Bal    Chk  Rate");
		System.out.println("= === ============================ ====== ===  ====");
		accounts.add(a);
		accounts.add(b);
		accounts.add(c);
		accounts.add(d);
		// iterate
		for(Account account : accounts) {
			System.out.println(account.print());
		}
	}

}
