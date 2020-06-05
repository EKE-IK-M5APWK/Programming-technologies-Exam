package decorator;

import common.Microphone;
import common.Speaker;

public abstract class IMotherboard {
	 protected Microphone microphone=new Microphone();
	 protected Speaker speaker=new Speaker();
	 public abstract String getDescription();
}
