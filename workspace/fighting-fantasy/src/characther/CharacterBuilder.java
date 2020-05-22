package characther;

public class CharacterBuilder {
	public static void Build(String name) {
		ICharacter character = new Character(new Hero());
		System.out.println("Üdvözletem! A nevem " + name +" !");
		character.showValue();
	}
}
