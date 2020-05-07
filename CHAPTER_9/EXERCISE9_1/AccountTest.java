package exercise9_7;

public class AccountTest {

	public static void main(String[] args) {
		
		Account testAccount = new Account(1122, 20000);
		testAccount.setAnnualInterestRate(0.045);
		testAccount.withdraw(2500);
		testAccount.deposit(3000);
		
		System.out.println("The balance of account " + testAccount.getId() +
				" is: " + testAccount.getBalance());
		System.out.println("The monthly interest of account" + testAccount.getId() +
				" is: " + testAccount.getMonthlyInterest());
		System.out.println("The date that account " + testAccount.getId() +
				" was created is: " + testAccount.getDate());
	}

}
