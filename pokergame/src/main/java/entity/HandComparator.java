/**
 * 
 */
package main.java.entity;

import java.util.List;

import main.java.enums.ERanking;

/**
 * @author Michel
 *
 */
public class HandComparator {
	
	/**
	 * Default constructor
	 */
	public HandComparator() {
		
	}
	
	/**
	 * Compares who is the winner
	 * @param bank ranking hand
	 * @param player ranking hand
	 * @return message
	 */
	public String getWinner(ERanking bank, ERanking player) {
		if(bank == player) {
			return "tie";
		}else {
			if(bank.ordinal()>player.ordinal()) {
				return "bank";
			}else {
				return "player";
			}
		}
	}
	
	public String getWinner(List<Card> bank, List<Card> player, List<Card> cardTable) {
		return null;
	}
}
