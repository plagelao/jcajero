import static org.junit.Assert.*;

import org.junit.Test;


public class TarjetaTest {

	@Test
	public void tarjetaValidaConNombreDeUsuario() {
		assertNotNull("La tarjeta deber’a ser v‡lida", Tarjeta.crear("Pepito"));
	}
	
}
