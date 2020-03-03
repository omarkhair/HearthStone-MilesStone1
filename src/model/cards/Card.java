package model.cards;
abstract public class Card {
	private String name ; 
	private int manaCost ; 
	private Rarity rarity;
	public Card() {}
	public Card(String name,int manaCost,Rarity rarity) {
		this.name = name ; 
		setManaCost(manaCost);
		this.rarity = rarity ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManaCost() {
		return manaCost;
	}
	public void setManaCost(int manaCost) {
		this.manaCost = Math.min(manaCost,10);
		this.manaCost = Math.max(this.manaCost,0);
	}
	public Rarity getRarity() {
		return rarity;
	}
	
	
	
}
