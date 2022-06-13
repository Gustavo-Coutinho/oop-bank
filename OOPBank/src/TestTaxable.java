
public class TestTaxable {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(222, 333);
		ca.deposit(100);
		
		LifeInsurance li = new LifeInsurance();
		TaxCalculator tc = new TaxCalculator();
		tc.register(ca);
		tc.register(li);
		
		System.out.println(tc.getTotalTaxes());
	}

}
