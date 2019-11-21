import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class voorbeeldjoelle {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int yourPoints = 0;
		int bankPoints = 0;
		String yourCards = "";
		String bankCards = "";
		String nextCard = "";
		
		String[] deck = new String[] {"Ace hearts", "2 hearts", "3 hearts", "4 hearts", "5 hearts", "6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "Jack hearts", "Queen hearts", "King hearts", "Ace diamonds", "2 diamonds", "3 diamonds", "4 diamonds", "5 diamonds", "6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds", "Jack diamonds", "Queen diamonds", "King diamonds", "Ace spades", "2 spades", "3 spades", "4 spades", "5 spades", "6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "Jack spades", "Queen spades", "King spades", "Ace clubs", "2 clubs", "3 clubs", "4 clubs", "5 clubs", "6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "Jack clubs", "Queen clubs", "King clubs"};
		
		List<String> shuffledDeck = Arrays.asList(deck);
		Collections.shuffle(shuffledDeck);
		deck = shuffledDeck.toArray(new String[shuffledDeck.size()]);

		System.out.println("~~BLACKJACK~~\n" + shuffledDeck);
	
		for (int q = 2; q > 0; q--) {
			
			nextCard = shuffledDeck.get(i);
			i++;
			yourCards = yourCards + nextCard + " | ";
			
			switch (nextCard.charAt(0)) {
				
				case '2': {
					yourPoints +=2;
					break;
				}
				case '3': {
					yourPoints +=3;
					break;
				}
				case '4': {
					yourPoints +=4;
					break;
				}
				case '5': {
					yourPoints +=5;
					break;
				}
				case '6': {
					yourPoints +=6;
					break;
				}
				case '7': {
					yourPoints +=7;
					break;
				}
				case '8': {
					yourPoints +=8;
					break;
				}
				case '9': {
					yourPoints +=9;
					break;
				}
				case '1':
				case 'J':
				case 'Q':
				case 'K': {
					yourPoints +=10;
					break;
				}
				case 'A': {
					if (yourPoints + 11 <= 21) yourPoints +=11;
					else yourPoints +=1;
					break;
				}
				
			}
			
			System.out.println("you receive: " + nextCard + " | total points: " + yourPoints);	
		
		}
		
		for (int q = 2; q > 0; q--) {
			
			nextCard = shuffledDeck.get(i);
			i++;
			bankCards = bankCards + nextCard + " | ";
			
			switch (nextCard.charAt(0)) {
				
				case '2': {
					bankPoints +=2;
					break;
				}
				case '3': {
					bankPoints +=3;
					break;
				}
				case '4': {
					bankPoints +=4;
					break;
				}
				case '5': {
					bankPoints +=5;
					break;
				}
				case '6': {
					bankPoints +=6;
					break;
				}
				case '7': {
					bankPoints +=7;
					break;
				}
				case '8': {
					bankPoints +=8;
					break;
				}
				case '9': {
					bankPoints +=9;
					break;
				}
				case '1':
				case 'J':
				case 'Q':
				case 'K': {
					bankPoints +=10;
					break;
				}
				case 'A': {
					if (bankPoints + 11 <= 21) bankPoints +=11;
					else bankPoints +=1;
					break;
				}
				
			}
			
			System.out.println("bank draws a card");	
		
		}
		
		System.out.println("k: receive card | p: pass | q: quit");
		
		
		while (yourPoints <= 21) {
			
			char input = sc.next().charAt(0);
			
			if (input == 'q') {
				System.out.println("you left the game.");
				System.exit(0);
			} else if (input == 'k') {
				nextCard = shuffledDeck.get(i);
				i++;
				yourCards = yourCards + nextCard + " | ";
				
				switch (nextCard.charAt(0)) {
					
					case '2': {
						yourPoints +=2;
						break;
					}
					case '3': {
						yourPoints +=3;
						break;
					}
					case '4': {
						yourPoints +=4;
						break;
					}
					case '5': {
						yourPoints +=5;
						break;
					}
					case '6': {
						yourPoints +=6;
						break;
					}
					case '7': {
						yourPoints +=7;
						break;
					}
					case '8': {
						yourPoints +=8;
						break;
					}
					case '9': {
						yourPoints +=9;
						break;
					}
					case '1':
					case 'J':
					case 'Q':
					case 'K': {
						yourPoints +=10;
						break;
					}
					case 'A': {
						if (yourPoints + 11 <= 21) yourPoints +=11;
						else yourPoints +=1;
						break;
					}
					
				}
				
				System.out.println("you receive: " + nextCard + " | total points: " + yourPoints);
				
				if (yourPoints > 21) {
					System.out.println("you lose.\ngame over.");
					System.exit(0);					
					
				}
				
			} else if (input == 'p') {
				System.out.println("you have: " + yourCards + "total points: " + yourPoints);
				System.out.println("bank has: " + bankCards + "total points: " + bankPoints);
				
				while (bankPoints < 17 && bankPoints <= yourPoints) {					
					nextCard = shuffledDeck.get(i);
					i++;
					bankCards = bankCards + nextCard + " | ";
					
					switch (nextCard.charAt(0)) {
						
						case '2': {
							bankPoints +=2;
							break;
						}
						case '3': {
							bankPoints +=3;
							break;
						}
						case '4': {
							bankPoints +=4;
							break;
						}
						case '5': {
							bankPoints +=5;
							break;
						}
						case '6': {
							bankPoints +=6;
							break;
						}
						case '7': {
							bankPoints +=7;
							break;
						}
						case '8': {
							bankPoints +=8;
							break;
						}
						case '9': {
							bankPoints +=9;
							break;
						}
						case '1':
						case 'J':
						case 'Q':
						case 'K': {
							bankPoints +=10;
							break;
						}
						case 'A': {
							if (bankPoints + 11 <= 21) bankPoints +=11;
							else bankPoints +=1;
							break;
						}
						
					}
					
					System.out.println("bank draws: " + nextCard + " | total points: " + bankPoints);
					
				}
				
				if (yourPoints > bankPoints || bankPoints > 21) {
					System.out.println("you win.");	
				}
				
				else if (yourPoints == bankPoints) {
					System.out.println("it is a tie.");
				}
				
				else
					System.out.println("you lose.");
				
				System.out.println("game over.");
				System.exit(0);
				
			}
			
		}
		
		System.out.println("game over.");
		System.exit(0);
		
	}	
	
}