import static org.junit.Assert.*;

import org.junit.Test;

public class CajeroTest {

	@Test
	public void elCajeroAceptaUnaTarjeta() {
		
		assertTrue("El cajero acepta la tarjeta", new Cajero().aceptaTarjeta(new Tarjeta(){}));
	}
	
}
