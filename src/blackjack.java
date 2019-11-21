import java.util.Scanner;

public class blackjack {

		
		void start() {
			System.out.println("Blackjack! Je hebt gewonnen, gefeliciteerd :) ");
			System.out.println("Wil je nog een keer spelen? qType J voor ja en N voor nee");

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