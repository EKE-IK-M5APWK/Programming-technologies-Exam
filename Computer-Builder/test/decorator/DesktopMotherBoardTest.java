package decorator;

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

public class DesktopMotherBoardTest {
	public DesktopMotherBoardTest() throws Exception {

	}

	PowerSupply desktoppowersupply = new PowerSupply(Grades.GOLD, 550, 160, true);
	Camera desktopcamera = new Camera(16);
	Memory desktopmemory = new Memory(3200, MemorySocket.DDR4, 16);
	Processor desktopprocessor = new Processor(6, 12, 3.4, ProcessorSocket.AM4);
	Screen desktopscreen = new Screen(24, Resolution.FULLHD);
	GraphicCard desktopgraphiccard = new GraphicCard(1536, 6, 128, 1830, GraphicCardManufacture.Asus);
	DesktopMotherboard dm = new DesktopMotherboard(desktoppowersupply.DeepCopy(), desktopcamera.DeepCopy(),
			desktopmemory.DeepCopy(), desktopprocessor.DeepCopy(), desktopscreen.DeepCopy(),
			desktopgraphiccard.DeepCopy(), MemorySocket.DDR4, ProcessorSocket.AM4);

	int amount = 0;

	@Test
	public void testMemoryCompatibility() throws Exception {
		System.out.println("MemoryCompatiblityTest");
		Memory memory = new Memory(2200, MemorySocket.DDR4, 8192);
		DesktopMotherboard dm = new DesktopMotherboard(desktoppowersupply.DeepCopy(), desktopcamera.DeepCopy(), memory,
				desktopprocessor.DeepCopy(), desktopscreen.DeepCopy(), desktopgraphiccard.DeepCopy(), MemorySocket.DDR4,
				ProcessorSocket.AM4);
		boolean result = dm.MemoryCompatibility(memory);
		assertTrue("Memory socket not combatible with motherboard!", result);
	}

	@Test
	public void testProcessorCompatibility() throws Exception {
		System.out.println("MemoryCompatiblityTest");
		Processor processor = new Processor(8, 16, 3.4, ProcessorSocket.AM1);
		DesktopMotherboard dm = new DesktopMotherboard(desktoppowersupply.DeepCopy(), desktopcamera.DeepCopy(),
				desktopmemory.DeepCopy(), processor, desktopscreen.DeepCopy(), desktopgraphiccard.DeepCopy(),
				MemorySocket.DDR4, ProcessorSocket.AM1);
		boolean result = dm.ProcessorCompatibility(processor);
		assertTrue("Processor socket not combatible with motherboard!", result);
	}

	@Test
	public void GetInfoTest() {
		assertNotNull(dm.getDescription());
	}

	@Test
	public void ScreenTest() throws Exception {
		Screen screen = new Screen(24, Resolution.FULLHD);
	}

	

}
