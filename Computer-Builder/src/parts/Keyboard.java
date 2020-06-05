package parts;

import details.National;

public class Keyboard {

	private National nat = National.HUN;
	private int buttons = 101;

	public String getKeyboard() {
		return String.valueOf(nat) + " keyboard";
	}
	private static Keyboard uniqueInstance = null;

	private Keyboard() {
	}

	public static Keyboard getInstance() {
		if (uniqueInstance == null) 
		{
			uniqueInstance = new Keyboard(); 
		}
		return uniqueInstance;
	}
}
