/**
 * 
 */
package main.java.interfaces;

import java.util.List;

import main.java.entity.Card;

/**
 * @author Michel
 *
 */
public interface IDeck {
	/**
	 * Gets the deck
	 * @return deck
	 */
	public List<Card> getDeck();
	
	/**
	 * Shuffles the deck
	 */
	public void shuffleDeck();
	
	/**
	 * Picks a card
	 * @return card
	 */
	public Card pop();
	
	/**
	 * Gets the deck size
	 * @return deck size
	 */
	public int getDeckSize();
	
}
