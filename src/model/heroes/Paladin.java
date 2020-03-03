package model.heroes;

import java.io.IOException;
import java.util.ArrayList;

import model.cards.Card;
import model.cards.Rarity;
import model.cards.minions.Minion;
import model.cards.spells.*;

public class Paladin extends Hero {

	public Paladin() throws IOException {
		super("Uther Lightbringer");
	}

	@Override
	public void buildDeck() throws IOException {
		ArrayList<Card> myDeck= getDeck();
		ArrayList<Minion> myMinions = getNeutralMinions(getAllNeutralMinions("neutral_minions.csv"), 15);
		for(Card c: myMinions)
			myDeck.add(c);
		myDeck.add(new SealOfChampions());
		myDeck.add(new SealOfChampions());
		myDeck.add(new LevelUp());
		myDeck.add(new LevelUp());
		myDeck.add(new Minion( "Tirion Fordring", 4, Rarity.LEGENDARY, 6, 6, true, true, false));
		shuffleDeck(myDeck);
	}


}
