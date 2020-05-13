package characther;

public class Character implements ICharacter {
	
	private String characterName;
	private CharacterStrategy characterStrategy;
	
	private int dexterity;
	private int stamina;
	private int luck;
	private int gold;
	private int potions;
	
	public Character(CharacterStrategy characterStrategy) {
		this.characterStrategy = characterStrategy;
		setDexterity();
		setStamina();
		setLuck();
		setGold();
	}

	public void setName(String characterName){
		this.characterName = characterName;
	}
	public void setDexterity(){
		this.dexterity = characterStrategy.setDexterity();
	}
	public void setStamina(){
		this.stamina = characterStrategy.setStamina();
	}
	public void setLuck(){
		this.luck = characterStrategy.setLuck();
	}
	public void setGold(){
		this.gold = characterStrategy.setGold();
	}
	public void setPotions(){
		this.potions = characterStrategy.setHealthPotions();
	}
	public String getName(){
		return characterName;
	}

	@Override
	public int getDexterity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStamina() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLuck() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGold() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHealthPotion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showValue() {
		// TODO Auto-generated method stub
		
	}
	
}
