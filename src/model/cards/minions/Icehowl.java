package model.cards.minions;

import model.cards.Rarity;

public class Icehowl extends Minion{

	public Icehowl() {
		super("Icehowl",9,Rarity.LEGENDARY,10,10,false,false,true);
	}
	public Icehowl (String name,int manaCost,Rarity rarity, int attack,int maxHP,boolean
			 taunt,boolean divine,boolean charge) {
		super(name, manaCost, rarity, attack, maxHP, taunt, divine, charge);
	}
}
