/**
 * 
 */
package main.java.entity;

import java.io.Serializable;

import main.java.enums.EPlayer;
import main.java.enums.ERanking;
import main.java.interfaces.IPlayer;

/**
 * @author Michel
 *
 */
public class Player implements Serializable, IPlayer {

	private static final long serialVersionUID = -3536646891888887281L;

	private String name;
	private Card[] hand = new Card[2];
	private EPlayer status;
	private int amount;
	private ERanking combination;
	private float percent;
	
	/**
	 * Default constructor
	 * @param name
	 * @param status
	 * @param amount
	 */
	public Player(String name, EPlayer status, int amount) {
		this.name = name;
		this.status = status;
		this.amount = amount;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Card[] getHand() {
		return hand;
	}

	@Override
	public void setHand(Card card1, Card card2) {
		this.hand[0] = card1;
		this.hand[1] = card2;
	}

	@Override
	public void setPlayer(EPlayer player) {
		this.status = player;

	}

	@Override
	public EPlayer getPlayer() {
		return status;
	}

	@Override
	public int getAmount() {
		return this.amount;
	}

	@Override
	public void addAmount(int amount) {
		this.amount += amount;
		
	}

	@Override
	public void lostHand(int amount) {
		this.amount-= amount;
	}

	@Override
	public ERanking getRankingHand() {
		return this.combination;
	}

	@Override
	public void setRankingHand(ERanking ranking) {
		this.combination = ranking;
	}

	@Override
	public float getPercentWin() {
		return this.percent;
	}

	@Override
	public void setPercentWin(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return status + "name " + name +" with " + amount;
	}
	
	

}
