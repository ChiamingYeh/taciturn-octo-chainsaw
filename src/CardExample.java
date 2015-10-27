import com.mindtree.entity.Card;
import com.mindtree.service.CardService;

public class CardExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King" };
		
		CardService cardser = new CardService(); //If I need to use any method in the class, I need to
												 //create the instance of it first so that I can call the method 
												 //The only exception is when I have static method so then I can just call it directly 
		
		
		//Card[] cardDeck= new Card[52];
		int counter = 0;
		for(int i=0; i<suits.length;i++){
			for(int j=0; j<ranks.length; j++){
				cardser.addCardToDeck(new Card(suits[i], ranks[j]), counter);
				counter++;
			}
		}
		
		Card testCard= new Card(suits[0], ranks[0]);
		cardser.addCardToDeck(testCard, counter);
		cardser.getAllCards();
		/*
		 * add 52 cards to the deck boolean CardService.addCardToDeck(Card card)
		 */
		/*
		 * try adding duplicate card to deck the method should return false
		 */
		/*
		 * print the cards added to deck Card[] CardService.getAllCards()
		 */
		
		
		
		//TESTING1 
		
	}
}