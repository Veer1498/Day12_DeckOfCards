package oopsproblems;
/**
 * 
 * A Program on Deck Of Cards
 * @author Veer.Singa
 *
 */

public class Main {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 1.Create  a New Object of DeckOfCards Class
		 * 2.Call the functions of the new object
		 * 3. It will perform the following actions and print. 
		 * 
		 */
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
