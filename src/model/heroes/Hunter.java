package model.heroes;

import java.io.IOException;
import java.util.ArrayList;

import model.cards.Card;
import model.cards.Rarity;
import model.cards.minions.*;
import model.cards.spells.*;

public class Hunter extends Hero{

	public Hunter() throws IOException {
		super("Rexxar");
	}

	public void buildDeck() throws IOException {
		ArrayList<Card> myDeck= getDeck();
		ArrayList<Minion> myMinions = getNeutralMinions(getAllNeutralMinions("neutral_minions.csv"), 15);
		for(Card c: myMinions)
			myDeck.add(c);
		myDeck.add(new KillCommand());
		myDeck.add(new KillCommand());
		myDeck.add(new MultiShot());
		myDeck.add(new MultiShot());
		myDeck.add(new Minion("King Krush", 9, Rarity.LEGENDARY, 8, 8, false, false, true));
		shuffleDeck(myDeck);
	}
}
