package model.heroes;

import java.io.IOException;
import java.util.ArrayList;

import model.cards.Card;
import model.cards.Rarity;
import model.cards.minions.Minion;
import model.cards.spells.*;

public class Mage extends Hero {

	public Mage() throws IOException {
		super("Jaina Proudmoore");
	}

	@Override
	public void buildDeck() throws IOException {
		ArrayList<Card> myDeck= getDeck();
		ArrayList<Minion> myMinions = getNeutralMinions(getAllNeutralMinions("neutral_minions.csv"), 13);
		for(Card c: myMinions)
			myDeck.add(c);
		myDeck.add(new Polymorph());
		myDeck.add(new Polymorph());
		myDeck.add(new Flamestrike());
		myDeck.add(new Flamestrike());
		myDeck.add(new Pyroblast());
		myDeck.add(new Pyroblast());
		myDeck.add(new Minion("Kalycgos", 10, Rarity.LEGENDARY, 4, 12, false, false, false));
		shuffleDeck(myDeck);		
	}

}
