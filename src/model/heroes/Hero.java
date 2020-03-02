package model.heroes;

import java.util.ArrayList;

public abstract class Hero {
	private String name;
	private int currentHP;
	private boolean heroPowerUsed;
	private int totalManaCrystals;
	private int currentManaCrystals;
	private ArrayList<Card> deck;
	private ArrayList<Minion> field;
	private ArrayList<Card> hand;
	int fatigueDamage;
	
	public Hero() {
		currentHP=30;
		deck= new ArrayList<Card>();
		field= new ArrayList<Minion>();
		hand= new ArrayList<Card>();
	}
	public Hero(String name) {
		this();
		this.name=name;
	}
	//--------------------------Getters and Setters------------------------
	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public boolean isHeroPowerUsed() {
		return heroPowerUsed;
	}

	public void setHeroPowerUsed(boolean heroPowerUsed) {
		this.heroPowerUsed = heroPowerUsed;
	}

	public int getTotalManaCrystals() {
		return totalManaCrystals;
	}

	public void setTotalManaCrystals(int totalManaCrystals) {
		this.totalManaCrystals = totalManaCrystals;
	}

	public int getCurrentManaCrystals() {
		return currentManaCrystals;
	}

	public void setCurrentManaCrystals(int currentManaCrystals) {
		this.currentManaCrystals = currentManaCrystals;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public ArrayList<Minion> getField() {
		return field;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}
	//----------------------------------------------------------------------

	
}
