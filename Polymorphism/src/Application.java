import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		ShowRoom showRoom = new ShowRoom();

		System.out.println("Enter your choice 1-3");
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		
		IAutomobile polyAuto = showRoom.getProduct(ch);
		
		showRoom.printQuote(polyAuto);
		
		sc.close();
		
	}

}
