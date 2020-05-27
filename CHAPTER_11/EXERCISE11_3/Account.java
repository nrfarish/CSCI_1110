package exercise11_3;
import java.util.Date;

/**
 * Basic account set up class
 * @author Nicholas Farish
 * @date 05/20/20
 */
public class Account {

	private int accountNumber = 0;
	double balance = 0;
	private double annualInterestRate;
	private Date dateCreated = new java.util.Date();
	
	public Account() 
	{
	}

	public Account(int a, double b) 
	{
		accountNumber = a;
		balance = b;
	}

	public int getAccountNumber() 
	{
		return accountNumber;
	}

	public void setAccountNumber(int a) 
	{
		accountNumber = a;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double a) 
	{
		balance = a;
	}

	public double withdraw(double a) {
		return balance -= a;
	}

	public double deposit(double a) {
		return balance += a;
	}
	
	public String toString()
	{
		return "Created on: " + this.dateCreated.toString() +
				"\nAccount Number: " + this.accountNumber +
				"\nCurrent Balance: " + this.balance +
				"\nAnnual Interest Rate: " + this.annualInterestRate;
	}
}
