import java.util.Scanner;

import characther.CharacterBuilder;

public class run {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("A kocsmába betoppanva a fogadós vár téged. Alacsony törp fickó, hosszú barna szakállal. Oda kiált neked: \"Mi a neved vándor?\" ");
        System.out.println("Erre azt válaszolod, hogy....:");
        String name = input.next();
        try {
        	CharacterBuilder.Build(name);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("\"Üdvözöllek!\" - Mondta a törpe a bajszát megpenderitve. \"Sokan megfordultak már erre felé, de tudod mindnyájan elbuktak. Talán te leszel a serencsés aki legyõzi a szörnyet!\"");
		System.out.println("\"Indulj északnak, arra leled a szerencséd!\" A kalandor el is indult. Késõbb rátalált a szörny barlangjára. Meg is támadta a fene nagy bestiát aki vissza támadta ellenfelét!");
		System.out.println("Harcra fel!");
		

	}

}
