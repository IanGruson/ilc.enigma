package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

	@Test
	public void zero_ABCD_0() {
		Rotor rotor1 = Rotor.rotorFactory( "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z", "Q");
		int actual = rotor1.convertForward(0);
		int expected = 0;
		assertEquals(actual, expected);
	}
}
