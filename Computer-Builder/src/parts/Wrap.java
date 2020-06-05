package parts;

public class Wrap {
	private static double width = 260;
	private static double length = 378;
	private static double height = 22.9;

	public static double getWidth() {
		return width;
	}

	public static double getLength() {
		return length;
	}

	public String getWrap() {
		return "Wrap Details: "+"Width: "+String.valueOf(width) + "x,Length: " + String.valueOf(length) + "x, Height: " + String.valueOf(height) + "wrap";
	}

	public static double getHeight() {
		return height;
	}

	private static Wrap uniqueInstance = null;

	private Wrap() {
	}

	public static Wrap getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Wrap();
		}
		return uniqueInstance;
	}
}