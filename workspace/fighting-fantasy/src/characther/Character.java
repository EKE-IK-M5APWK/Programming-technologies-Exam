package characther;

public class Character implements ICharacter {
	
	private String characterName;
	private HeroStrategy heroStrategy;
	
	private int dexterity;
	private int stamina;
	private int luck;
	private int gold;
	private int potions;
	
	public Character(HeroStrategy heroStrategy) {
		this.heroStrategy = heroStrategy;
		setDexterity();
		setStamina();
		setLuck();
		setGold();
	}

	public void setName(String characterName){
		this.characterName = characterName;
	}
	public void setDexterity(){
		this.dexterity = heroStrategy.setDexterity();
	}
	public void setStamina(){
		this.stamina = heroStrategy.setStamina();
	}
	public void setLuck(){
		this.luck = heroStrategy.setLuck();
	}
	public void setGold(){
		this.gold = heroStrategy.setGold();
	}
	public void setPotions(){
		this.potions = heroStrategy.setHealthPotions();
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
