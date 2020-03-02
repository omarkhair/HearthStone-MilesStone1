package model.cards.spells;
import model.cards.*; 
public class KillCommand extends Spell implements MinionTargetSpell,HeroTargetSpell{
	public KillCommand() {
		super("Kill Command",3,Rarity.COMMON);
	}
}
