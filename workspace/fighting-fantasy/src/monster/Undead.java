package monster;

import characther.ICharacter;

public class Undead extends MonsterDecorator {

	public Undead(ICharacter character) {
		super(character);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDexterity() {
		return character.getDexterity() - 2;
	}

	@Override
	public int getStamina() {
		return character.getStamina() - 2;
	}

	@Override
	public int getLuck() {
		return character.getLuck() - 1;
	}

	@Override
	public int getGold() {
		return character.getGold() + 1;
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
