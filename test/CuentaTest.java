import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void consultarElSaldoDeUnaCuenta() throws Exception {
		ConectorMock conector = new ConectorMock(1000);
		Cuenta cuenta = Cuenta.crear("WONDERLAND", conector);

		assertEquals(1000, cuenta.consultarSaldo());
		assertTrue(conector
				.haHechoUnSendA("debit_card/balance?token=WONDERLAND"));
	}

}
