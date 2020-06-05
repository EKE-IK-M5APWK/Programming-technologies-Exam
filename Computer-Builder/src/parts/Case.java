package parts;

public class Case {
	private static double width = 21.6;
	private static double depth = 44.8;
	private static double height = 41.3;
	private static String size = "Mid Tower";
	public static double getWidth() {
		return width;
	}

	public static double getDepth() {
		return depth;
	}

	public String getCase() {
		return "Case Details:"+size+","+
				"Width:"+String.valueOf(width) + "cm," +"Depth"+ String.valueOf(depth) + "cm," +"Height:"+ String.valueOf(height) + "cm";
	}

	public static double getHeight() {
		return height;
	}

	private static Case uniqueInstance = null;

	private Case() {
	}

	public static Case getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Case();
		}
		return uniqueInstance;
	}
}
