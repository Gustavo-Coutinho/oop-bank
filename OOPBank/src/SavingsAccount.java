
public class SavingsAccount extends Account {
	public SavingsAccount(int branchId, int accountId) {
		super(branchId, accountId);
	}

	@Override
	public void deposit(double amount) {
		super.balance = super.balance + amount;
	}
}