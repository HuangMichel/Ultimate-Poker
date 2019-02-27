/**
 * 
 */
package main.java.entity;

import java.io.Serializable;

import main.java.enums.ECard;
import main.java.enums.ESuit;
import main.java.interfaces.ICard;

/**
 * @author Michel
 *
 */
public class Card implements ICard, Serializable {

	private static final long serialVersionUID = 5711510714207562422L;

	private ESuit suit;
	private ECard rank;
	
	/**
	 * Default constructor
	 * @param suit the suit card
	 * @param rank the rank card
	 */
	public Card(ESuit suit, ECard rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	@Override
	public ESuit getSuit() {
		return suit;
	}

	@Override
	public ECard getCardRank() {
		return rank;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}else if(!(obj instanceof Card)) {
			return false;
		}else {
			Card c = (Card) obj;
			return this.rank.equals(c.getCardRank()) && this.suit.equals(c.getSuit());
		}
	}

	@Override
	public String toString() {
		return "Card " + rank +" of " +suit;
	}

	@Override
	public int getValue() {
		return this.rank.ordinal()+1;
	}

	
}
