
public class VehicleLoan extends AbstractLoan {

	private double vehicleAmount;
	
	public VehicleLoan(double vehicleAmount){
		this.vehicleAmount = vehicleAmount;
	}
	
	@Override
	public double findEligibility() {
		// TODO Auto-generated method stub
		return 0.9*vehicleAmount;
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return findEligibility()*0.035;
	}

}
