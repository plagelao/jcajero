import static org.junit.Assert.*;

import org.junit.Test;


public class TarjetaTest {

	@Test
	public void tarjetaValidaConNombreDeUsuario() {
		assertNotNull("La tarjeta deber’a ser v‡lida", Tarjeta.crear("Pepito"));
	}

	@Test
	public void tarjetaInvalidaSinNombreDeUsuario() {
		assertEquals("La tarjeta deber’a no ser v‡lida", Tarjeta.TARJETA_INVALIDA ,Tarjeta.crear(null));
	}
	
}
