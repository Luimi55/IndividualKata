import static org.junit.Assert.*;

import org.junit.Test;

public class testTrim {

	@Test
	public void test() {
		Trim trim = new Trim();
		String result = trim.makeTrim("			hola como estas ");
		assertEquals("hola como estas", result);
	}

}
