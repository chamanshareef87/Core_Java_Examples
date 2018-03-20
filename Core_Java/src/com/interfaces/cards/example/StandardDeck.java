package com.interfaces.cards.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StandardDeck implements Deck {

	private List<Card> entireDeck;

	//Sort implementation
	@Override
	public void sort() {
		Collections.sort(entireDeck);
	}

	@Override
	public List<Card> getCards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deck deckFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addCard(Card card) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCards(List<Card> cards) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDeck(Deck deck) {
		// TODO Auto-generated method stub

	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
	}

	@Override
	public void sort(Comparator<Card> c) {
		// TODO Auto-generated method stub

	}

	@Override
	public String deckToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Card> getEntireDeck() {
		return entireDeck;
	}

	public void setEntireDeck(List<Card> entireDeck) {
		this.entireDeck = entireDeck;
	}

	public static void main(String[] args){
		StandardDeck sd = new StandardDeck();
		sd.entireDeck = new ArrayList<Card>();
		PlayingCard card = new PlayingCard();
		card.setRank(Card.Rank.FOUR);
		card.setSuit(Card.Suit.CLUBS); //club ==2
		sd.entireDeck.add(card);

		card = new PlayingCard();
		card.setRank(Card.Rank.SIX );
		card.setSuit(Card.Suit.DIAMONDS); //Diamond ==1 
		sd.entireDeck.add(card);

		card = new PlayingCard();
		card.setRank(Card.Rank.FIVE );
		card.setSuit(Card.Suit.SPADES);  //Spades == 4
		sd.entireDeck.add(card);

		System.out.println(sd.entireDeck);
		/*
		 * Sort method from playingcard is called
		 * Sort list of objects based on the suit and then the rank 
		 */
		sd.sort();
		System.out.println(sd.entireDeck);
		
	}
	
}
