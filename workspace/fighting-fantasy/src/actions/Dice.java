package actions;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	public class D6 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 7);	
				}
		}
}
