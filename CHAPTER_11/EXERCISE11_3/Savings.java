package exercise11_3;

/**
 * Savings subclass of Account class
 * @author Nicholas Farish
 * @date 05/20/20
 */
public class Savings extends Account
{
	
	public Savings()
	{
		super();
	}
	
	public Savings(int a, double b)
	{
		super(a, b);
	}
	
	public double withdraw(double a)
	{
		if (balance - a >= 0)
		{
			balance -= a;
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
		return balance;
	}
	
	public String toString()
	{
		return "Account Type: Savings\n" + super.toString();
	}
}
