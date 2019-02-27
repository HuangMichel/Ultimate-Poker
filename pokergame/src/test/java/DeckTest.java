/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.entity.Deck;

/**
 * @author Michel
 *
 */
public class DeckTest {

	Deck deck = new Deck();
	
	@Test
	public void testGetDeck() {
		assertTrue("deck is not null", deck.getDeckSize()==52);
	}

	@Test
	public void testShuffleDeck() {
		Deck deck2 = new Deck();
		deck.shuffleDeck();
		assertFalse("deck is shuffle", deck2.getDeck().get(0).equals(deck.getDeck().get(0)));
	}


	@Test
	public void testPop() {
		Deck deck2 = deck;
		deck.pop();
		assertTrue("deck is poped", deck2.getDeckSize()==51);
	}

	@Test
	public void testGetDeckSize() {
		assertTrue("deck size is equal", deck.getDeckSize()==52);
	}

}
