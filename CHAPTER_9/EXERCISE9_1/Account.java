package exercise9_7;

import java.util.Date;

/**
 * Program to create and track the balance of a new account.
 * @author Nic Farish
 *Date 05/06/20
 */
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	java.util.Date dateCreated = new java.util.Date();
	
	public Account() {
		
	}
	
	public Account(int a, double b) {
		id = a;
		balance = b;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId (int a) {
		id = a;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double a) {
		balance = a;
	}
	
	public String getDate() {
		return dateCreated.toString();
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double a) {
		annualInterestRate = a;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest() {
		double monthlyInterest;
		monthlyInterest = balance * this.getMonthlyInterestRate();
		return monthlyInterest;
	}
	
	public double withdraw(double a) {
		balance = balance - a;
		return balance;
	}
	
	public double deposit(double a) {
		balance = balance + a;
		return balance;
	}
}
