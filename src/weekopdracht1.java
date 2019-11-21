import java.util.Scanner;

public class weekopdracht1 {

	public static void main(String[] args) {}
	
	void start() {
		
		//String[] deck = {"HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "HB", "HV", "HK", };
		
		System.out.println("Welkom bij Blackjack!");
		//for(int i = 0; i < deck.length; i++)
			//System.out.print(deck[i]);
		System.out.println();
		System.out.println("Wilt u de kaarten schudden? Type J voor ja en N voor nee.");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(input);
		
		switch (input) {
		case "J":
		case "j":
			System.out.println("Hoi");
			new cards().start();
			break;
		case "N":
		case "n":
			System.out.println("Doei"); 
			break;
		case "default":
			System.out.println("Type nog een keer"); 
		break;	
		}
	
		sc.close();

	}

}
