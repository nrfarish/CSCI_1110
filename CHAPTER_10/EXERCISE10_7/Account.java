package exercise10_7;

public class Account 
{
	private int id = 0;
	private double balance = 0;
	
	public Account() 
	{
	}
	
	public Account(int a, double b) 
	{
		id = a;
		balance = b;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId (int a) 
	{
		id = a;
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
}
