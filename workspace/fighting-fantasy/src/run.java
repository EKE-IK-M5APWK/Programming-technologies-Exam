import java.util.Scanner;

import characther.CharacterBuilder;

public class run {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("A kocsm�ba betoppanva a fogad�s v�r t�ged. Alacsony t�rp fick�, hossz� barna szak�llal. Oda ki�lt neked: \"Mi a neved v�ndor?\" ");
        System.out.println("Erre azt v�laszolod, hogy....:");
        String name = input.next();
        try {
        	CharacterBuilder.Build(name);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("\"�dv�z�llek!\" - Mondta a t�rpe a bajsz�t megpenderitve. \"Sokan megfordultak m�r erre fel�, de tudod mindny�jan elbuktak. Tal�n te leszel a serencs�s aki legy�zi a sz�rnyet!\"");
		System.out.println("\"Indulj �szaknak, arra leled a szerencs�d!\" A kalandor el is indult. K�s�bb r�tal�lt a sz�rny barlangj�ra. Meg is t�madta a fene nagy besti�t aki vissza t�madta ellenfel�t!");
		System.out.println("Harcra fel!");
		

	}

}
