package main;

import java.awt.LinearGradientPaint;
import java.util.ArrayList;
import java.util.List;

import common.*;
import decorator.DesktopMotherboard;
import decorator.LaptopMotherboard;
import details.Grades;
import details.GraphicCardManufacture;
import details.MemorySocket;
import details.ProcessorSocket;
import details.Resolution;
import factory.BuildFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		List<DesktopMotherboard> Desktops = new ArrayList<DesktopMotherboard>();
		List<LaptopMotherboard> Laptops = new ArrayList<LaptopMotherboard>();
		BuildFactory buildfactory = new BuildFactory();

		// Laptop Building
		PowerSupply laptoppowersupply = buildfactory.PowerSupplyManufacturing(Grades.BRONZE, 100, 150, false);
		Camera laptopcamera = buildfactory.CameraManufacturing(8);
		Memory laptopmemory = buildfactory.MemoryManufacturing(1333, MemorySocket.DDR3, 8192);
		Processor laptopprocessor = buildfactory.ProcessorManufacturing(2, 6, 2.2, ProcessorSocket.LGA1155);
		Screen laptopscreen = buildfactory.ScreenManufacturing(15.6, Resolution.HD);
		GraphicCard laptopgraphiccard = buildfactory.GraphicCardManufacturing(960, 1, 116, 900,
				GraphicCardManufacture.Nvidia);

		// Prototype Laptop
		LaptopMotherboard lm = new LaptopMotherboard(laptoppowersupply.DeepCopy(), laptopcamera.DeepCopy(), laptopmemory.DeepCopy(), laptopprocessor.DeepCopy(),
				laptopscreen.DeepCopy(), laptopgraphiccard.DeepCopy(),MemorySocket.DDR3,ProcessorSocket.LGA1155);

		PowerSupply desktoppowersupply = buildfactory.PowerSupplyManufacturing(Grades.GOLD, 550, 160, true);
		Camera desktopcamera = buildfactory.CameraManufacturing(16);
		Memory desktopmemory = buildfactory.MemoryManufacturing(3200, MemorySocket.DDR4, 16384);
		Processor desktopprocessor = buildfactory.ProcessorManufacturing(6, 12, 3.4, ProcessorSocket.AM4);
		Screen desktopscreen = buildfactory.ScreenManufacturing(24, Resolution.FULLHD);
		GraphicCard desktopgraphiccard = buildfactory.GraphicCardManufacturing(1536, 6, 128, 1830,
				GraphicCardManufacture.Asus);
		DesktopMotherboard dm = new DesktopMotherboard(desktoppowersupply.DeepCopy(), desktopcamera.DeepCopy(), desktopmemory.DeepCopy(),
				desktopprocessor.DeepCopy(), desktopscreen.DeepCopy(), desktopgraphiccard.DeepCopy(),MemorySocket.DDR4,ProcessorSocket.AM4);
		
		Desktops=buildfactory.DekstopBuilding(10, dm.DeepCopy());
		Laptops=buildfactory.LaptopBuilding(10, lm.DeepCopy());
		
		System.out.println("Desktops: "+dm.getDescription()+"\n");
		System.out.println("Laptops: "+lm.getDescription()+"\n");
		
	}

}
