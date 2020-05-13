package characther;

public interface ICharacter {
	
	int getStrength();
	int getDexterity();
	int getConstitution();
	int getIntelligance();
	int getWisdom();
	int getCharisma();
	int getHealthPoint();
	int getArmorClass();
	int getGold();
	int getSpeed();
	int[] getSpellSlot();
	
	public void showValue();
}
