/**
 * 
 */
package main.java.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import main.java.enums.ECard;
import main.java.enums.ESuit;
import main.java.interfaces.IDeck;

/**
 * @author Michel
 *
 */
public class Deck implements IDeck, Serializable {

	private static final long serialVersionUID = 784582843731890394L;

	private List<Card> deck;
	private Random random;
	
	/**
	 * Default constructor
	 */
	public Deck() {
		this.random = new Random();
		createDeck();
	}
	
	@Override
	public List<Card> getDeck() {
		return this.deck;
	}

	@Override
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	@Override
	public Card pop() {
		return deck.remove(random.nextInt(deck.size()));
	}

	@Override
	public int getDeckSize() {
		return deck.size();
	}
	
	private void createDeck() {
		deck = new ArrayList<Card>();
		for(ESuit s : ESuit.values()) {
			for(ECard r : ECard.values()) {
				deck.add(new Card(s, r));
			}
		}
	}	
}
