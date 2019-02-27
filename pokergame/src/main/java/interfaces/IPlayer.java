/**
 * 
 */
package main.java.interfaces;

import main.java.entity.Card;
import main.java.enums.EPlayer;
import main.java.enums.ERanking;

/**
 * @author Michel
 *
 */
public interface IPlayer {
	/**
	 * Gets the player name
	 * @return name
	 */
	public String getName();
	
	/**
	 * Sets the player name
	 * @param name
	 */
	public void setName(String name);
	
	/**
	 * Gets the hand
	 * @return the hand
	 */
	public Card[] getHand();
	
	/**
	 * Sets the hand
	 * @param card1 the first card
	 * @param card2 the second card
	 */
	public void setHand(Card card1, Card card2);
	
	/**
	 * Sets the player status
	 * @param player status
	 */
	public void setPlayer(EPlayer player);
	
	/**
	 * Gets the player status
	 * @return
	 */
	public EPlayer getPlayer();
	
	/**
	 * Gets the total amount
	 * @return amount
	 */
	public int getAmount();
	
	/**
	 * Adds amount 
	 */
	public void addAmount(int amount);
	
	/**
	 * Lost the hand
	 * @param amount
	 */
	public void lostHand(int amount);
	
	/**
	 * Gets the combination
	 * @return combination
	 */
	public ERanking getRankingHand();
	
	/**
	 * Sets the combination
	 * @param ranking
	 */
	public void setRankingHand(ERanking ranking);
	
	/**
	 * Gets the percentage of win
	 * @return percent
	 */
	public float getPercentWin();
	
	/**
	 * Sets the percentage of win
	 * @param percent
	 */
	public void setPercentWin(float percent);
	
}
