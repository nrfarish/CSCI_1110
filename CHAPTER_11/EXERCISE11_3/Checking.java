package exercise11_3;

/**
 * Checking subclass of Account class.
 * @author Nicholas Farish
 * @date 05/20/20
 */
public class Checking extends Account
{
	private double overdraftLimit = -200;
	
	public Checking()
	{
		super();
	}
	
	public Checking(int a, double b, double c)
	{
		super(a, b);
		overdraftLimit = c;
	}
	
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double a)
	{
		overdraftLimit = a;
	}
	
	public double withdraw(double a)
	{
		if (balance - a >= overdraftLimit)
		{
			balance -=a;
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
		return balance;
	}
	
	public String toString()
	{
		return "Account Type: Checking\n" + super.toString() +
			"\nOverdraft Limit: " + overdraftLimit;
	}
}
