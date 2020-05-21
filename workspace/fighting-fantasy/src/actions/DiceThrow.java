package actions;
import java.util.concurrent.ThreadLocalRandom;

public class DiceThrow{

	public static int diceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 7);	
	}
}
