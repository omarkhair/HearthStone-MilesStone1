package engine;
import model.heroes.*;
import java.util.*;
public class Game {
	Hero firstHero;
	Hero secondHero;
	Hero currentHero;
	Hero opponent; 
	



	public Game() {
		
	}
	/*this constructor randomly chooses the starting hero giving him one mana*/
	public Game(Hero p1, Hero p2) {
		firstHero=p1;
		secondHero=p2;
		Random rand = new Random(); 
		int x=rand.nextInt(2);
		if(x==0) {
			currentHero=firstHero;
			opponent=secondHero;
			firstHero.setCurrentManaCrystals(1);
		}else {
			currentHero=secondHero;
			opponent=firstHero;
			secondHero.setCurrentManaCrystals(1);
		}
	}
	
	
	
	public Hero getCurrentHero() {
		return currentHero;
	}
	public Hero getOpponent() {
		return opponent;
	}
	 

}
