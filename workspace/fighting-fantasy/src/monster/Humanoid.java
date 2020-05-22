package monster;

import characther.ICharacter;

public class Humanoid extends MonsterDecorator {

	public Humanoid(ICharacter character) {
		super(character);
	}

	@Override
	public int getDexterity() {
		return character.getDexterity();
	}

	@Override
	public int getStamina() {
		return character.getStamina();
	}

	@Override
	public int getLuck() {
		return character.getLuck();
	}

	@Override
	public int getGold() {
		return character.getGold() * 0;
	}

	@Override
	public int getHealthPotion() {
		return character.getHealthPotion() * 0;
	}

	@Override
	public void showValue() {
		character.showValue();
	}
	

}
