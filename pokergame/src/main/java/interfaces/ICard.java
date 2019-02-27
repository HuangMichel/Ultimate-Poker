/**
 * 
 */
package main.java.interfaces;

import main.java.enums.ECard;
import main.java.enums.ESuit;

/**
 * @author Michel
 *
 */
public interface ICard {
	/**
	 * Gets the suit card
	 * @return suit
	 */
	public ESuit getSuit();
	
	/**
	 * Gets the rank card
	 * @return rank
	 */
	public ECard getCardRank();
	
	/**
	 * Gets the card value in integer
	 * @return rank
	 */
	public int getValue();
}
