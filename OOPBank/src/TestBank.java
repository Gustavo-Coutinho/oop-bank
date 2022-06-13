
public class TestBank {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(111, 122);
		ca.deposit(100);
		
		SavingsAccount sa = new SavingsAccount(222, 223);
		sa.deposit(200);
		
		
		ca.transfer(10, sa);
		System.out.println("Checking account: " + ca.getBalance());
		System.out.println("Savings account: " + sa.getBalance());

	}
	
}
