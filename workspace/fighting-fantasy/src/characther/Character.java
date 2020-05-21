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
		return dexterity;
	}

	@Override
	public int getStamina() {
		return stamina;
	}

	@Override
	public int getLuck() {
		return luck;
	}

	@Override
	public int getGold() {
		return gold;
	}

	@Override
	public int getHealthPotion() {
		return potions;
	}

	@Override
	public void showValue() {
		System.out.println("-- STATS --");
		System.out.println("DEXTERITY:"+getDexterity());
		System.out.println("STAMINA:"+getStamina());
		System.out.println("LUCK:"+getLuck());
		System.out.println("GOLD:"+getGold());
		System.out.println("POTIONS:"+getHealthPotion());
	}
	
}
