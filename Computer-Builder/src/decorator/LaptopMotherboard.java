package decorator;

import common.*;
import details.MemorySocket;
import details.ProcessorSocket;
import exceptions.*;
import parts.*;

public class LaptopMotherboard extends Motherboard {
	public Motherboard laptopmotherboard = new Motherboard();

	// Decorator
	@Override
	public String getDescription() {

		return laptopmotherboard.getDescription() +"\n"+ this.powersupply.getPowerSupply() + "\n" + this.camera.getCamera()
				+ "\n" + this.memory.getMemory() + "\n" + this.processor.getProcessor() + "\n" + this.screen.getScreen()
				+ "\n" + this.keyboard.getKeyboard() + "\n" + this.touchpad.getTouchpad() + "\n" + this.wrap.getWrap()
				+ "\n" + this.graphiccard.getGraphicCard() + ";";
	}

	private MemorySocket memorysocket;
	private ProcessorSocket processorsocket;
	private Processor processor;
	private PowerSupply powersupply;
	private Camera camera;
	private Memory memory;
	private Screen screen;
	private Keyboard keyboard;
	private Touchpad touchpad;
	private Wrap wrap;
	private GraphicCard graphiccard;

	public LaptopMotherboard(PowerSupply powersupply, Camera camera, Memory memory, Processor processor, Screen screen,
			GraphicCard graphiccard, MemorySocket memorysocket, ProcessorSocket processorsocket) throws Exception {

		this.powersupply = powersupply;
		this.camera = camera;
		this.memory = memory;
		this.processor = processor;
		this.screen = screen;
		this.keyboard = keyboard;
		this.touchpad = touchpad;
		this.memorysocket = memorysocket;
		this.processorsocket = processorsocket;
		this.graphiccard = graphiccard;
		///
		// Singleton
		this.wrap = Wrap.getInstance();
		this.touchpad = Touchpad.getInstance();
		this.keyboard = Keyboard.getInstance();

		if (!MemoryCompatibility(this.memory)) {

			throw new NotValidMemorySocket("Not valid Memory Socket!");
		}

		if (!ProcessorCompatibility(this.processor)) {
			throw new NotValidProcessorSocket("Not valid Porcessor Socket!");
		}

	}

	public boolean MemoryCompatibility(Memory memory) {
		//System.out.println(this.memorysocket + "\t" + this.memory.getMemorySocket());
		if (this.memorysocket != this.memory.getMemorySocket())
			return false;
		else
			return true;

	}

	public boolean ProcessorCompatibility(Processor processzor) {
		if (this.processorsocket != this.processor.getProcessorSocket()) {
			return false;
		} else
			return true;
	}

	public LaptopMotherboard DeepCopy() throws Exception {
		LaptopMotherboard clone = new LaptopMotherboard(powersupply, camera, memory, processor, screen, graphiccard,memorysocket,processorsocket);
		clone.powersupply = powersupply;
		clone.camera = camera;
		clone.memory = memory;
		clone.processor = processor;
		clone.screen = screen;
		clone.graphiccard=graphiccard;
		clone.memorysocket = memorysocket;
		clone.processorsocket = processorsocket;
		return clone;

	}
}
