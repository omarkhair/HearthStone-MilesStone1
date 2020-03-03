package model.heroes;

import java.io.IOException;
import java.util.ArrayList;

import model.cards.Card;
import model.cards.Rarity;
import model.cards.minions.Minion;
import model.cards.spells.*;

public class Priest extends Hero{

	public Priest() throws IOException {
		super("Anduin Wrynn");
	}

	@Override
	public void buildDeck() throws IOException {
		ArrayList<Card> myDeck= getDeck();
		ArrayList<Minion> myMinions = getNeutralMinions(getAllNeutralMinions("neutral_minions.csv"), 13);
		for(Card c: myMinions)
			myDeck.add(c);
		myDeck.add(new DivineSpirit());
		myDeck.add(new DivineSpirit());
		myDeck.add(new HolyNova());
		myDeck.add(new HolyNova());
		myDeck.add(new ShadowWordDeath());
		myDeck.add(new ShadowWordDeath());
		myDeck.add(new Minion("Prophet Velen", 7, Rarity.LEGENDARY, 7, 7, false, false, false));
		shuffleDeck(myDeck);	
		
	}

}
