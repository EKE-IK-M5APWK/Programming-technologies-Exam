package common;

import details.MemorySocket;
import exceptions.NotValidMemory;

public class Memory {
	public Memory(double frequency, MemorySocket socket, double sizemb) {
		setFrequency(frequency);
		setMemorySocket(socket);
		setSizemb(sizemb);
	}

	private double frequency;
	private MemorySocket socket;
	private double sizemb;

	public String getMemory() {
		return "Memory Details: " + String.valueOf(sizemb) + " mb capacity," + String.valueOf(frequency) + "Mhz frequency,"
				+ "DRM type:" + String.valueOf(socket);
	}

	private void setFrequency(double frequency) {
		if (666 >= frequency || frequency >= 4600)
			throw new NotValidMemory("Memory's frequency is incorrect!");
		else
			this.frequency = frequency;
	}

	public double getFrequency() {
		return frequency;
	}

	private void setSizemb(double sizemb) {
		if (0 >= sizemb || sizemb >= 131072)
			throw new NotValidMemory("Memory's size is incorrect!");
		else
			this.sizemb = sizemb;
	}

	public double getSizemb() {
		return sizemb;
	}

	private void setMemorySocket(MemorySocket socket) {
		this.socket = socket;
	}

	public MemorySocket getMemorySocket() {
		return socket;
	}

	public Memory DeepCopy() {
		Memory clone = new Memory(getFrequency(), getMemorySocket(), getSizemb());
		clone.setSizemb(getSizemb());
		clone.setFrequency(getFrequency());
		clone.setMemorySocket(getMemorySocket());

		return clone;
	}
}
