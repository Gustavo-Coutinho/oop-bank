
public class CheckingAccount extends Account implements Taxable {
	public CheckingAccount(int branchId, int accountId) {
		super(branchId, accountId);
	}
	
	@Override
	public boolean withdraw(double amount) {
		double amountWithTax = amount + 0.2;
		return super.withdraw(amountWithTax);
	}

	@Override
	public void deposit(double amount) {
		super.balance = super.balance + amount;
	}

	@Override
	public double getTaxValue() {
		// TODO Auto-generated method stub
		return super.balance * 0.01;
	}
	
}
