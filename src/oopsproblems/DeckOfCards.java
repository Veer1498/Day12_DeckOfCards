package oopsproblems;
import java.util.Scanner;
public class DeckOfCards {
	Scanner sc = new Scanner(System.in);
	int noOfPlayers = sc.nextInt() ;
	int noOfCardsPerPerson = 9;
	String playersArray[][] = new String [noOfPlayers][noOfCardsPerPerson];
	String deckOfCards [] = new String [52];
	int deck[] = new int [52];
	String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","King","Queen","Ace"};
	
	public DeckOfCards(){
		for (int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		
	}
	
	void ShuffleCards() {
		for(int i=0;i<deck.length;i++) {
			int index = (int)Math.floor(Math.random()*deck.length);
			int temp=deck[i];
			deck[i]= deck[index];
			deck[index]=temp;
			
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			deckOfCards[i] = suit +"-"+rank;
		}
	}
	
	void assignCards() {
		int count = 0;
		
		for (int i=0;i<noOfPlayers;i++){
			for(int j=0;j<noOfCardsPerPerson;j++) {	
				playersArray[i][j] = deckOfCards[count++];
			}
		}
	}
	
	void display() {
		for (int i=0;i<noOfPlayers;i++){
			System.out.println("Player No."+(i+1));
			System.out.println("============");

			System.out.println("");
			for(int j=0;j<noOfCardsPerPerson;j++) {	
				System.out.println(playersArray[i][j]);
				System.out.println("");
			}
		}
	}

}
