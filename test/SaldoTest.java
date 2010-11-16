import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SaldoTest {

	@Test
	public void equals() throws Exception {
		Saldo s1 = new Saldo(1000);
		Saldo s2 = new Saldo(1000);
		Saldo s3 = new Saldo(800);

		assertTrue(s1.equals(s2));
		assertFalse(s1.equals(s3));
	}
}
