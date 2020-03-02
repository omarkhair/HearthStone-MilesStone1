package model.heroes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import model.cards.*;
import model.cards.minions.*;

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
		currentHP = 30;
		deck = new ArrayList<Card>();
		field = new ArrayList<Minion>();
		hand = new ArrayList<Card>();
	}

	public Hero(String name) {
		this();
		this.name = name;
	}

	// --------------------------Getters and Setters------------------------
	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = Math.min(currentHP,30);
		this.currentHP = Math.max(this.currentHP,0);
		
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

		this.totalManaCrystals = Math.min(totalManaCrystals, 10);
		this.totalManaCrystals = Math.max(this.totalManaCrystals, 0);
	}

	public int getCurrentManaCrystals() {
		return currentManaCrystals;
	}

	public void setCurrentManaCrystals(int currentManaCrystals) {
		this.currentManaCrystals = Math.min(currentManaCrystals, 10);
		this.currentManaCrystals = Math.max(this.currentManaCrystals, 0);
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

	// ----------------------------------------------------------------------
	final public static ArrayList<Minion> getAllNeutralMinions(String filePath) throws IOException {
		ArrayList<Minion> l = new ArrayList<Minion>();
		String currentLine = "";
		FileReader fileReader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fileReader);
		while ((currentLine = br.readLine()) != null) {
			String[] attributes = currentLine.split(",");
			String name = attributes[0];
			int manaCost = Integer.parseInt(attributes[1]);
			Rarity rarity;
			switch (attributes[2].charAt(0)) {
			case 'b':
				rarity = Rarity.BASIC;
				break;
			case 'c':
				rarity = Rarity.COMMON;
				break;
			case 'r':
				rarity = Rarity.RARE;
				break;
			case 'e':
				rarity = Rarity.EPIC;
				break;
			default:
				rarity = Rarity.LEGENDARY;
			}
			int attack = Integer.parseInt(attributes[3]);
			int maxHP = Integer.parseInt(attributes[4]);
			boolean taunt = attributes[5].equals("TRUE") ? true : false;
			boolean divine = attributes[6].equals("TRUE") ? true : false;
			boolean charge = attributes[7].equals("TRUE") ? true : false;
			if (name.equals("Icehowl")) {
				l.add(new Icehowl());
			} else {
				Minion m = new Minion(name, manaCost, rarity, attack, maxHP, taunt, divine, charge);
				l.add(m);
			}
		}
		return l;
	}

	final public static ArrayList<Minion> getNeutralMinions(ArrayList<Minion> minions, int count) {
		ArrayList<Minion> newList = new ArrayList<Minion>();
		int[] freqarray = new int[minions.size()];
		for (int i = 0; i < count; i++) {
			Random rand = new Random();
			int x = rand.nextInt(minions.size());
			int freq = freqarray[x];
			if (freq >= 2) {
				i--;
				continue;
			}
			Minion cur = minions.get(x);
			if (freq == 1 && cur.getRarity() == Rarity.LEGENDARY) {
				i--;
				continue;
			}
			// add----------------------------------------------------------------
			newList.add(cur);
			freqarray[x]++;
		}
		return newList;

	}
//	abstract public void buildDeck() throws IOException{
//		
//	}

}
