package decorator;
import decorator.IMotherboard;

public class Motherboard extends IMotherboard {
	private IMotherboard motherboard;


	public Motherboard() {
		this.speaker = speaker.DeepCopy();
		this.microphone = microphone.DeepCopy();
	}
	@Override
	public String getDescription() {
		return "Specifications: " + this.speaker.getSpeaker() + ";" + this.microphone.getMicrophone() + ";";
	}
}
