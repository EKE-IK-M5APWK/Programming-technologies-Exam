package decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import common.Camera;
import common.GraphicCard;
import common.Memory;
import common.PowerSupply;
import common.Processor;
import common.Screen;
import details.Grades;
import details.GraphicCardManufacture;
import details.MemorySocket;
import details.ProcessorSocket;
import details.Resolution;
import parts.Touchpad;

public class LaptopMotherBoardTest  {
	public LaptopMotherBoardTest() throws Exception {
		
	}
	PowerSupply laptoppowersupply = new PowerSupply(Grades.BRONZE, 100, 150, false);
	Camera laptopcamera = new Camera(8);
	Memory laptopmemory = new Memory(1333, MemorySocket.DDR3, 8);
	Processor laptopprocessor = new Processor(2, 6, 2.2, ProcessorSocket.AM1);
	Screen laptopscreen = new Screen(15.6, Resolution.HD);
	GraphicCard laptopgraphiccard = new GraphicCard(960, 1, 116, 900,
			GraphicCardManufacture.Nvidia);
	
	LaptopMotherboard lm = new LaptopMotherboard(laptoppowersupply, laptopcamera, laptopmemory, laptopprocessor, laptopscreen, laptopgraphiccard, MemorySocket.DDR3,ProcessorSocket.AM1);
	
	int amount = 0;
	@Test
	public void testMemoryCompatibility() throws Exception {
		System.out.println("MemoryCompatiblityTest");
		Memory memory = new Memory(2200, MemorySocket.DDR3, 8192);
		LaptopMotherboard lm = new LaptopMotherboard(laptoppowersupply,laptopcamera,memory,laptopprocessor,laptopscreen,laptopgraphiccard,MemorySocket.DDR3,ProcessorSocket.AM1);
		boolean result = lm.MemoryCompatibility(memory);
		assertTrue("Memory socket not combatible with motherboard!", result);
	}
	@Test
	public void testProcessorCompatibility() throws Exception {
		System.out.println("MemoryCompatiblityTest");
		Processor processor = new Processor(8, 16, 3.4, ProcessorSocket.AM1);
		DesktopMotherboard dm = new DesktopMotherboard(laptoppowersupply,laptopcamera,laptopmemory,processor,laptopscreen,laptopgraphiccard,MemorySocket.DDR3,ProcessorSocket.AM1);
		boolean result = dm.ProcessorCompatibility(processor);
		assertTrue("Processor socket not combatible with motherboard!", result);
	}
	@Test
	public void GetInfoTest() {
		assertNotNull(lm.getDescription());
	}

	@Test
	public void ScreenTest() throws Exception {
		Screen screen = new Screen(24, Resolution.FULLHD);
	}
	@Test
	public void PowerSupplyTest() throws Exception {
		PowerSupply ps =  new PowerSupply(Grades.PLATINUM,600,150,false);
	}
	
}
