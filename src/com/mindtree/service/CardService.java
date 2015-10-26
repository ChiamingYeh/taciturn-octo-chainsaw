package com.mindtree.service;

import com.mindtree.entity.Card;

public class CardService {

	private Card[] cards = new Card[52];

	public boolean addCardToDeck(Card card, int counter) {
		// for(int i=0; i<cards.length;i++){
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				if ((cards[i].equals(card))) {
					//System.out.println("Fail!");
					// }
					return false;
				}
			} else {
				cards[counter] = card;
				//System.out.println("Success");
				return true;
			}

		}
		/*
		 * for(int i=0; i<cards.length; i++){ if(!(cards.equals(card))){
		 * cards[i]=card;
		 */
		return false;

		/*
		 * for (Card cardInDeck:cards){ if(card.equals(cardInDeck)){ return
		 * true; } }
		 */

		/*
		 * cards[i++]=card; // work as the same as i++ on this line return
		 * false;
		 */
	}

	public Card getAllCards() {
		//int i = 0;
		for (Card cardInDeck : cards) {
			System.out.println("Rank: " + cardInDeck.getRank() + "\n"
					+ "Suit: " + cardInDeck.getSuit()+ "\n");
			//System.out.println(i++);
		}
		return null;
	}
}