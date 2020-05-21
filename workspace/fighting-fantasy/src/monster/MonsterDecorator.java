package monster;

import characther.ICharacter;

public abstract class MonsterDecorator implements ICharacter {
	protected ICharacter character;
	
	public MonsterDecorator(ICharacter character){
		this.character = character;
	}
}
