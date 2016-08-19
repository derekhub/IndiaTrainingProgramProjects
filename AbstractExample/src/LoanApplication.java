
public class LoanApplication {
	
	public static void printDetails(AbstractLoan loan){
		System.out.println(loan.findEligibility());
		System.out.println(loan.calculateInterest());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GoldLoan loan1 = new GoldLoan(232);
		printDetails(loan1);
		System.out.println();
		
		LandLoan loan2 = new LandLoan(8347);
		printDetails(loan2);
		System.out.println();
		
		VehicleLoan loan3 = new VehicleLoan(8374);
		printDetails(loan3);
		System.out.println();
		
	}

}
