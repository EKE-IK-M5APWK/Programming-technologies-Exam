package common;

import exceptions.NotValidCameraValue;

public class Camera {
	public Camera(double mp) {
		setMegapixels(mp);
	};

	private double megapixels;

	public String getCamera() {
		return "Camera Details:"+String.valueOf(megapixels) + "mpx camera ";
	}

	public void setMegapixels(double megapixels) {
		if (0 >= megapixels || megapixels >= 100)
			throw new NotValidCameraValue("Camera dosen't have proper megapixel size!");
		else
			this.megapixels = megapixels;
	}

	public double getMegapixels() {
		return megapixels;
	}

	public Camera DeepCopy() {
		Camera clone = new Camera(this.getMegapixels());
		clone.setMegapixels(getMegapixels());

		return clone;

	}
}
