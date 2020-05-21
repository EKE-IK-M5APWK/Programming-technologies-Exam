package test;

import org.junit.jupiter.api.Test;

import actions.DiceThrow;


public class DiceThrowTest {
	@Test
    public void diceThrowingValidValue() {
		int diceThrow = DiceThrow.diceThrow();
        assert diceThrow > 0 && diceThrow < 7;
    }

}
