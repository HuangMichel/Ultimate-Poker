/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.entity.Card;
import main.java.enums.ECard;
import main.java.enums.ESuit;

/**
 * @author Michel
 *
 */
public class CardTest {

	Card card1 = new Card(ESuit.DIAMOND, ECard.EIGHT);
	
	@Test
	public void testGetSuit() {
		assertTrue("suit equal", card1.getSuit()==ESuit.DIAMOND);
		assertFalse("suit not equal", card1.getSuit()==ESuit.HEART);
	}

	@Test
	public void testGetCardRank() {
		assertTrue("rank equal", card1.getCardRank()==ECard.EIGHT);
		assertFalse("rank not equal", card1.getCardRank()==ECard.ACE);
		assertTrue("rank equal", card1.getValue()==8);
		assertFalse("rank not equal", card1.getValue()==11);
	}

	@Test
	public void testEqualsObject() {
		Card card2 = new Card(ESuit.DIAMOND, ECard.EIGHT);
		Card card3 = new Card(ESuit.HEART, ECard.EIGHT);
		
		assertTrue("card equal", card1.equals(card2));
		assertFalse("card not equal", card1.equals(card3));
	}

}
