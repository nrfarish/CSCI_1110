package exercise10_7;
import java.util.Scanner;
/*
 * Simple ATM interface program simulation
 * @author Nicholas Farish
 * @date 05/13/20
 */
public class ATM 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Account accounts[] = new Account[10];
		int user = 0;
		int accountId = -1;
		
		for (int i =0; i < accounts.length; i++)
		{
			accounts[i] = new Account(i, 100);
		}
		
		while (accountId < 0 || accountId > 9)
		{
			System.out.print("Please enter your account ID: ");
			accountId = input.nextInt();
		
			while (user <= 0 || user >= 5)
			{
				System.out.print("Main Menu"
						+ "\n1. View the balance"
						+ "\n2. Make a deposit"
						+ "\n3. Make a withdrawl"
						+ "\n4. Exit Menu"
						+ "\nPlease choose and option: ");
				user = input.nextInt();

				while (user == 1)
				{
					System.out.println("The current balance for account ID " 
							+ accountId + " is: " + accounts[accountId].getBalance());
					user = 0;
				}

				while (user == 2)
				{
					System.out.print("Enter an amount to deposit: ");
					accounts[accountId].deposit(input.nextDouble());
					user = 0;
				}

				while (user == 3)
				{
					System.out.print("Enter an amount to withdraw: ");
					accounts[accountId].withdraw(input.nextDouble());
					user = 0;
				}

				while (user == 4)
				{
					accountId = -1;
					user = 0;
					break;
				}
				
				break;
			}
		}
	}
}
