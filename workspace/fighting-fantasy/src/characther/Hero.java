package characther;

import actions.DiceThrow;

public class Hero extends HeroStrategy{
	
	public int setDexterity() {
		return (DiceThrow.diceThrow()/2) + 7;
	}
	public int setStamina() {
		return DiceThrow.diceThrow()+DiceThrow.diceThrow()+10;
	}
	public int setLuck() {
		return DiceThrow.diceThrow()+6;
	}
	public int setGold() {
		return 0;
	}
	public int setHealthPotions() {
		return 3;
	}

}
