package common;

public class Speaker {
	public Speaker() {
	}

	public String getSpeaker() {
		return "speaker";
	}

	public Speaker DeepCopy() {
		Speaker clone = new Speaker();
		return clone;
	}
}
