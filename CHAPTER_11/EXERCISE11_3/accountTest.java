package exercise11_3;

/**
 * Program to create Account, Checking, and Savings
 * objects and call their toString() methods.
 * @author Nicholas Farish
 * @date 05/21/20
 */
public class accountTest {

	public static void main(String[] args)
	{
		Account newAccount = new Account(0, 100);
		Checking newChecking = new Checking(1, 100, -200);
		Savings newSavings = new Savings(2, 100);
		
		System.out.println(newAccount.toString());
		System.out.println(newChecking.toString());
		System.out.println(newSavings.toString());
	}

}
