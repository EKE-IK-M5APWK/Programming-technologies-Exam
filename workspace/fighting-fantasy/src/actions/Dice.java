package actions;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	public class D4 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 5);
		}
	}
	public class D6 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 21);	
				}
		}
	public class D8 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 9);
				}
		}
	public class D10 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 10);
				}
		}
	public class D12 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 12);
				}
		}
	public class D20 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 20);
				}
		}
	public class D100 extends DiceThrowStrategy{
		public int DiceThrow() {
			return ThreadLocalRandom.current().nextInt(1, 101);
				}
		}
}
