package model.heroes;

import java.io.IOException;
import java.util.ArrayList;

import model.cards.Card;
import model.cards.Rarity;
import model.cards.minions.Minion;
import model.cards.spells.*;

public class Warlock extends Hero{

	public Warlock() throws IOException {
		super("Gul'dan");
	}

	@Override
	public void buildDeck() throws IOException {
		ArrayList<Card> myDeck= getDeck();
		ArrayList<Minion> myMinions = getNeutralMinions(getAllNeutralMinions("neutral_minions.csv"), 13);
		for(Card c: myMinions)
			myDeck.add(c);
		myDeck.add(new CurseOfWeakness());
		myDeck.add(new CurseOfWeakness());
		myDeck.add(new SiphonSoul());
		myDeck.add(new SiphonSoul());
		myDeck.add(new TwistingNether());
		myDeck.add(new TwistingNether());
		myDeck.add(new Minion("Wilfred Fizzlebang", 6, Rarity.LEGENDARY, 4, 4, false, false, false));
		shuffleDeck(myDeck);	
		
	}

}
