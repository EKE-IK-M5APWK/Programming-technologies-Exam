package common;

import details.ProcessorSocket;
import exceptions.NotValidProcessor;

public class Processor {
	public Processor(int core,int thread, double clockspeed, ProcessorSocket socket) {
		setCores(core);
		setThreads(thread);
		setClockSpeed(clockspeed);
		setProcessorSocket(socket);
	}
	public int getThreads() {
		return thread;
	}
	private void setThreads(int thread) {
		if(thread < 1 || thread > 128) throw  new NotValidProcessor("Processor thread amount is incorrect!");
		this.thread = thread;
	}
	public int getCores() {
		return core;
	}
	private void setCores(int core) {
		if(core < 1 || core > 64) throw  new NotValidProcessor("Processor core amount is incorrect!");
		this.core = core;
	}

	public String getProcessor() {
		return "Processor Details:"+String.valueOf(core) + "core," + String.valueOf(clockspeed) 
		+ "Ghz clockspeed,"+String.valueOf(thread)+" threads,"+"Socket type:"+String.valueOf(socket) ;
	}

	private int core;
	private int thread;
	private double clockspeed;
	private ProcessorSocket socket;

	private void setProcessorSocket(ProcessorSocket socket) {
		this.socket = socket;
	}

	public ProcessorSocket getProcessorSocket() {
		return socket;
	}


	private void setClockSpeed(double clockspeed) {
		if (0 >= clockspeed || clockspeed >= 60000)
			throw new NotValidProcessor("Processor clockspeed is incorrect!");
		this.clockspeed = clockspeed;
	}

	public double getClockSpeed() {
		return clockspeed;
	}

	public Processor DeepCopy() {
		Processor clone = new Processor(getCores(),getThreads(), getClockSpeed(), getProcessorSocket());
		clone.setClockSpeed(getClockSpeed());
		clone.setCores(getCores());
		clone.setThreads(getThreads());
		clone.setProcessorSocket(getProcessorSocket());

		return clone;
	}
}
