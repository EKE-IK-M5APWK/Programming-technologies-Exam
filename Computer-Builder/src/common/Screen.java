package common;

import details.Resolution;
import exceptions.NotValidValue;

public class Screen {
	public Screen(double width, Resolution resolution) {
		setWidth(width);
		setResolution(resolution);
	}

	public String getScreen() {
		return "Screen Details:"+String.valueOf(resolution) + " resolution," + "Width:"+String.valueOf(width) + "' screen";
	}

	private double width;
	private Resolution resolution;

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

	public void setWidth(double width) {
		if (width <= 0 || width >= 50)
			throw new NotValidValue("Screen's width is incorrect!");
		else
			this.width = width;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public double getWidth() {
		return width;
	}

	public Screen DeepCopy() {
		Screen clone = new Screen(getWidth(), getResolution());
		clone.setResolution(getResolution());
		clone.setWidth(getWidth());
		return clone;
	}

}
