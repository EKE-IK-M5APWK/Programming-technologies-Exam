package common;

public class Microphone {
	public Microphone() {
	}

	public String getMicrophone() {
		return "microphone";
	}

	public Microphone DeepCopy() {
		Microphone clone = new Microphone();
		return clone;
	}
}
