
public class ShowRoom  {

	public IAutomobile getProduct(int ch){
		
		IAutomobile auto = null;
		
		switch (ch) {
		case 1:
			
			auto = new MarutiCar();
			break;
			
		case 2:
			
			auto = new ToyotaCar();
			break;
			
		case 3:
			
			auto = new HyndaiCar();
			break;

		default:
			break;
		}
		
		return auto;
		
	}
	
	public void printQuote (IAutomobile polyAuto){
		
		System.out.println(IAutomobile.SHOWROOMNAME);
		System.out.println("Model :=" + polyAuto.getModel());
		System.out.println("Color :=" + polyAuto.getColor());
		System.out.println("Price :=" + polyAuto.getPrice());

		
		
		
		
	}

}
