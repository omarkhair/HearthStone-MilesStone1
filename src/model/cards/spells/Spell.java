package model.cards.spells;

abstract public class Spell extends Card{
	public Spell() {
			
	}
	public Spell(String name, int manaCost ,Rarity rarity) {
		super(name,manaCost,rarity);
	}
}
