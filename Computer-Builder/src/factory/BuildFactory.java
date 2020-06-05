package factory;

import java.util.ArrayList;
import java.util.List;

import common.*;
import decorator.*;
import details.Grades;
import details.GraphicCardManufacture;
import details.MemorySocket;
import details.ProcessorSocket;
import details.Resolution;

public class BuildFactory {
	List<DesktopMotherboard> Desktops;
	List<LaptopMotherboard> Laptops;

	public List<DesktopMotherboard> DekstopBuilding(int amount, DesktopMotherboard dm) {
		Desktops = new ArrayList<DesktopMotherboard>();
		for (int i = 0; i < amount; i++) {
			try {
				Desktops.add(dm.DeepCopy());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Desktops;
	}

	public List<LaptopMotherboard> LaptopBuilding(int amount, LaptopMotherboard lm) {
		Laptops = new ArrayList<LaptopMotherboard>();
		for (int i = 0; i < amount; i++) {
			try {
				Laptops.add(lm.DeepCopy());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Laptops;
	}

	public PowerSupply PowerSupplyManufacturing(Grades grade, double wat, double size, boolean modular) {
		return new PowerSupply(grade, wat, size, modular);
	}

	public Camera CameraManufacturing(double cm) {
		return new Camera(cm);
	}

	public Memory MemoryManufacturing(double frequency, MemorySocket socket, double sizemb) {
		return new Memory(frequency, socket, sizemb);
	}

	public Processor ProcessorManufacturing(int core, int thread, double clockspeed, ProcessorSocket socket) {
		return new Processor(core, thread, clockspeed, socket);
	}

	public Screen ScreenManufacturing(double width, Resolution resolution) {
		return new Screen(width, resolution);
	}

	public GraphicCard GraphicCardManufacturing(int core, int memory, int size, double clockspeed,
			GraphicCardManufacture manufacture) {
		return new GraphicCard(core, memory, size, clockspeed, manufacture);
	}

}
