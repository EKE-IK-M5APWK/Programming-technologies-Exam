package actions;

import characther.Character;
import monster.Humanoid;

public class Actions {
	public static void AttackAction(Character player, Humanoid monster) {
		/*
		 * NOT YET IMPLEMENTED - TODO: IMPLEMENTAION OF ATTACK ACTION NEEDED.
		 * */
		
		int monsterCalculatedValue = (DiceThrow.diceThrow()*2) + monster.getDexterity();
		int playerCalculatedValue = (DiceThrow.diceThrow()*2) + player.getDexterity();
		
		if (monsterCalculatedValue > playerCalculatedValue) { 
			System.out.println("A sz�rnyeteg 2 sebz�st okozott "+player.getName()+"-en.");
		}
			
		else{
			System.out.println(player.getName()+" 2 sebz�st okozott a sz�rny�n.");	
		}
		
	}
}
