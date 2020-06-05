package decorator;

import common.Camera;
import common.GraphicCard;
import common.Memory;
import common.PowerSupply;
import common.Processor;
import common.Screen;
import details.MemorySocket;
import details.ProcessorSocket;
import exceptions.NotValidMemorySocket;
import exceptions.NotValidProcessorSocket;
import parts.*;

public class DesktopMotherboard extends Motherboard {
	public Motherboard desktopmotherboard = new Motherboard();

	// Decorator
	@Override
	public String getDescription() {

		return desktopmotherboard.getDescription() + this.powersupply.getPowerSupply() + "\n" + this.camera.getCamera()
				+ "\n" + this.memory.getMemory() + "\n" + this.processor.getProcessor() + "\n"
				+ this.keyboard.getKeyboard() + "\n" + this.tower.getCase() + "\n"
				+ this.graphiccard.getGraphicCard() + ";";
	}

	private MemorySocket memorysocket;
	private ProcessorSocket processorsocket;
	private Processor processor;
	private PowerSupply powersupply;
	private Camera camera;
	private Memory memory;
	private Screen screen;
	private Keyboard keyboard;
	private Mouse mouse;
	private Case tower;
	private GraphicCard graphiccard;

	public DesktopMotherboard(PowerSupply powersupply, Camera camera, Memory memory, Processor processor, Screen screen,
			GraphicCard graphiccard, MemorySocket memorysocket, ProcessorSocket processorsocket) throws Exception {

		this.powersupply = powersupply;
		this.camera = camera;
		this.memory = memory;
		this.processor = processor;
		this.screen = screen;
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.memorysocket = memorysocket;
		this.processorsocket = processorsocket;
		this.graphiccard = graphiccard;
		///
		// Singleton
		this.tower = Case.getInstance();
		this.mouse = Mouse.getInstance();
		this.keyboard = Keyboard.getInstance();

		if (!MemoryCompatibility(this.memory)) {
			throw new NotValidMemorySocket("Not valid Memory Socket!");
		}

		if (!ProcessorCompatibility(this.processor)) {
			throw new NotValidProcessorSocket("Not valid Porcessor Socket!");
		}

	}

	public boolean MemoryCompatibility(Memory memory) {
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

	public DesktopMotherboard DeepCopy() throws Exception {
		DesktopMotherboard clone = new DesktopMotherboard(powersupply, camera, memory, processor, screen, graphiccard,
				memorysocket, processorsocket);
		clone.powersupply = powersupply;
		clone.camera = camera;
		clone.memory = memory;
		clone.processor = processor;
		clone.screen = screen;
		clone.graphiccard = graphiccard;
		clone.memorysocket = memorysocket;
		clone.processorsocket = processorsocket;
		return clone;

	}
}
