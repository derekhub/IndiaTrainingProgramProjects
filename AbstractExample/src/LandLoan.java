
public class LandLoan extends AbstractLoan {
	
	private double land;
	
	public LandLoan(double land){
		this.land = land;
	}
	
	@Override
	public double findEligibility() {
		// TODO Auto-generated method stub
		return 0.2*this.land;
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return findEligibility()*0.029;
	}

}
