package com.mindtree.entity;

public class Card{

	private String suit;
	private String rank;

	public Card() {

	}

	public Card(String suit, String rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card &&(((Card)obj).getSuit()==this.getSuit())&&(((Card)obj).getRank()==this.getRank())){
			return true;
		}
		return false;
	}	
}
