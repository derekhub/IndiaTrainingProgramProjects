/**
 * 
 */

/**
 * @author dchoi3
 *
 */
public class GoldLoan extends AbstractLoan {
	
	private double grams;

	public GoldLoan(double grams){
		this.grams = grams;
	}
	
	@Override
	public double findEligibility() {
		// TODO Auto-generated method stub
		return 2000.0*this.grams;
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return findEligibility()*0.024;
	}

}
