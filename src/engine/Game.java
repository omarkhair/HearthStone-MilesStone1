package engine;
import model.heroes.*;
import java.util.*;
public class Game {
	private Hero firstHero;
	private Hero secondHero;
	private Hero currentHero;
	private Hero opponent; 
	



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
			firstHero.setTotalManaCrystals(1);
			firstHero.setCurrentManaCrystals(1); //current or total or both??
		}else {
			currentHero=secondHero;
			opponent=firstHero;
			secondHero.setTotalManaCrystals(1);
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
