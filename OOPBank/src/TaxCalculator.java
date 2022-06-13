
public class TaxCalculator implements Taxable {

	@Override
	public double getTaxValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private double totalTaxes;
	
	public void register(Taxable t) {
		double amount = t.getTaxValue();
		this.totalTaxes = this.totalTaxes + amount;
	}
	public double getTotalTaxes() {
		return this.totalTaxes;
	}

}
