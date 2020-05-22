package test;

import org.junit.jupiter.api.Test;
import characther.Character;
import characther.Hero;

public class AttributesTest {
	@Test
    public void DexterityCorrectInterval() {
		Character person = new Character(new Hero());
		assert person.getDexterity() >= 8 && person.getDexterity() <=10;
    }
	@Test
    public void StaminaCorrectInterval() {
		Character person = new Character(new Hero());
		assert person.getStamina() >= 12 && person.getStamina() <= 22;
    }
	@Test
    public void LuckCorrectInterval() {
		Character person = new Character(new Hero());
		assert person.getLuck()>= 7 && person.getLuck() <= 12;
		
    }
	@Test
    public void GoldCantBeNegative() {
		Character person = new Character(new Hero());
		assert person.getGold() >= 0;
		
    }
	@Test
    public void PotionCantBeNegative() {
		Character person = new Character(new Hero());
		assert person.getHealthPotion() >= 0;
		
    }
	
}
