package com.interfaces.cards.example;

public class PlayingCard implements Card {

	private Card.Suit suit;
	private Card.Rank rank;
	
	
	/*
	 * we are overriding hash code method as per our needs(non-Javadoc)
	 * First sort objects based on suit then sort based on rank
	 * Comparer method uses this hashcode to sort objects
	 */
	
	public void setSuit(Card.Suit suit) {
		this.suit = suit;
	}

	public void setRank(Card.Rank rank) {
		this.rank = rank;
	}

	public int hashCode() {
		System.out.println("Returning hash code::"+((suit.value()-1)*13)+rank.value());
	    return ((suit.value()-1)*13)+rank.value();
	}
	
	@Override
	public int compareTo(Card o) {
		return this.hashCode() - o.hashCode();
	}


	@Override
	public Suit getSuit() {
		return suit;
	}

	@Override
	public Rank getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "PlayingCard [suit=" + suit + ", rank=" + rank + "]";
	}

	
}
