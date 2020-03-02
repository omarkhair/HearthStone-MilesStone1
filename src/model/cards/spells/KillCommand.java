package model.cards.spells;

public class KillCommand extends Spells implements MinionTargetSpell,HeroTargetSpell{
	public KillCommand() {
		super("Kill Command",3,COMMON);
	}
}
