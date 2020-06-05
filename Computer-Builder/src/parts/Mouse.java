package parts;

public class Mouse {
	

	public String getMouse() {
		return "mouse";
	}

	private static Mouse uniqueInstance = null;

	private Mouse() {
	}

	public static Mouse getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Mouse();
		}
		return uniqueInstance;
	}
}
