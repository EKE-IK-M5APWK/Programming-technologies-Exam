package characther;

public class CharacterBuilder {
	public static void Build(String name) {
		ICharacter character = new Character(new Hero());
		System.out.println("�dv�zletem! A nevem " + name +" !");
		character.showValue();
	}
}
