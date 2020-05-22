package monster;

import characther.ICharacter;

public class Dragon extends MonsterDecorator {

	public Dragon(ICharacter character) {
		super(character);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDexterity() {
		return character.getDexterity()+4;
	}

	@Override
	public int getStamina() {
		return character.getStamina()+1;
	}

	@Override
	public int getLuck() {
		return character.getLuck()+1;
	}

	@Override
	public int getGold() {
		return character.getGold()+10;
	}

	@Override
	public int getHealthPotion() {
		return character.getHealthPotion()+5;
	}

	@Override
	public void showValue() {
		character.showValue();
	}

}
