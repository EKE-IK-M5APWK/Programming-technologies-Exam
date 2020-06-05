package common;

import details.GraphicCardManufacture;
import exceptions.NotValidProcessor;
import exceptions.NotValidValue;

public class GraphicCard {
	public GraphicCard(int core,int memory,int size, double clockspeed, GraphicCardManufacture manufacture) {
		setCores(core);
		setMemory(memory);
		setSize(size);
		setClockSpeed(clockspeed);
		setGraphicCardManufacture(manufacture);
	}
	public String getGraphicCard() {
		return "Graphic Card Details:"+String.valueOf(core) + "core," + String.valueOf(clockspeed) + "Ghz processor,"+String.valueOf(memory)+" Gb memory,"
				+String.valueOf(size)+" mm,"+String.valueOf(manufacture)+ " manufactured";
	}
	public void setGraphicCardManufacture(GraphicCardManufacture manufacture) {
		this.manufacture = manufacture;
	}
	public GraphicCardManufacture getGraphicCardManufacture() {
		return manufacture;
	}
	public void setSize(int size) {
		 if(0>=size ||size>=500) throw new NotValidValue("Graphic cards size is incorrect!");
		 this.size = size;
	}
	public int getSize() {
		return size;
	}
	private void setMemory(int memory) {
		if(memory < 1||memory > 11) throw new NotValidValue("Graphic cards memory size is incorrect!");
		 this.memory = memory;
		
	}
	public int getMemory() {
		return memory;
	}
	public int getCores() {
		return core;
	}
	private void setCores(int core) {
		if(core < 700 || core > 4000) throw  new NotValidProcessor("Graphic cards CUDA cores are incorrect!");
		this.core = core;
	}

	public String getProcessor() {
		return String.valueOf(memory) + "GB memory," + String.valueOf(clockspeed) + "Mhz Memory Speed";
	}

	private int memory;
	private int core;
	private int size;
	private double clockspeed;
	private GraphicCardManufacture manufacture;


	public void setClockSpeed(double clockspeed) {
		if (0 >= clockspeed || clockspeed >= 60000)
			throw new NotValidProcessor("Graphic cards clockspeed is incorrect!");
		this.clockspeed = clockspeed;
	}

	public double getClockSpeed() {
		return clockspeed;
	}

	public GraphicCard DeepCopy() {
		GraphicCard clone = new GraphicCard(getCores(),getMemory(),getSize(),getClockSpeed(),getGraphicCardManufacture()); 
		clone.setClockSpeed(getClockSpeed());
		clone.setCores(getCores());
		clone.setMemory(getMemory());
		clone.setSize(getSize());
		clone.setGraphicCardManufacture(getGraphicCardManufacture());
		return clone;
	}
}
