package parts;

public class Touchpad {
	private double lenth = 50;
	private double width = 70;

	public String getTouchpad() {
		return "touchpad";
	}

	private static Touchpad uniqueInstance = null;

	private Touchpad() {
	}

	public static Touchpad getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Touchpad();
		}
		return uniqueInstance;
	}
}
