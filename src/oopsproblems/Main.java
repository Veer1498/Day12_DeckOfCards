package oopsproblems;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Plase Enter How Many Players are There");
		DeckOfCards dc = new DeckOfCards();
		System.out.println("Welcome to Deck Of Cards Program");
		System.out.println("********************************");
		System.out.println("");

		dc.ShuffleCards();
		dc.assignCards();
		dc.display();
	}

}
