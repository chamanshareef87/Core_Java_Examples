package com.interfaces.cards.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByRankThenSuit implements Comparator<Card> {

	@Override
	public int compare(Card firstCard, Card secondCard) {
		System.out.println("sorting rank followed by suit");
		int compVal = firstCard.getRank().value() - secondCard.getRank().value();
		if (compVal != 0)
			return compVal;
		else
			return firstCard.getSuit().value() - secondCard.getSuit().value();
	}

	public static void main(String[] args){
		StandardDeck myDeck = new StandardDeck();
		addDecks(myDeck);
		System.out.println(myDeck.getEntireDeck());
		myDeck.shuffle();
		System.out.println(myDeck.getEntireDeck());
		myDeck.sort(new SortByRankThenSuit());
		System.out.println(myDeck.getEntireDeck());
		
		myDeck.sort(
			    (firstCard, secondCard) -> {
			        int compare =
			            firstCard.getRank().value() - secondCard.getRank().value();
			        if (compare != 0)
			            return compare;
			        else
			            return firstCard.getSuit().value() - secondCard.getSuit().value();
			    }      
		);
		System.out.println(myDeck.getEntireDeck());
		
	}

	private static void addDecks(StandardDeck myDeck) {

		List<Card> entireDeck = new ArrayList<Card>();
		myDeck.setEntireDeck(entireDeck);
		PlayingCard card = new PlayingCard();
		card.setRank(Card.Rank.FOUR);
		card.setSuit(Card.Suit.CLUBS); //club ==2
		myDeck.getEntireDeck().add(card);

		card = new PlayingCard();
		card.setRank(Card.Rank.SIX );
		card.setSuit(Card.Suit.DIAMONDS); //Diamond ==1 
		myDeck.getEntireDeck().add(card);

		card = new PlayingCard();
		card.setRank(Card.Rank.FIVE );
		card.setSuit(Card.Suit.SPADES);  //Spades == 4
		myDeck.getEntireDeck().add(card);

	}
}
