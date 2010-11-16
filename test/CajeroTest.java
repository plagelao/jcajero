import static org.junit.Assert.*;

import org.junit.Test;

public class CajeroTest {

	@Test
	public void elCajeroAceptaUnaTarjetaConUnUsuarioValido() {
	
		BancoMock banco = new BancoMock();
		Tarjeta tarjeta = Tarjeta.crear("Pepito");
		
		assertTrue("El cajero acepta la tarjeta", new Cajero(banco).aceptaTarjeta(tarjeta));
		assertTrue("El cajero debe intentar validar la tarjeta contra el banco", banco.seHaIntentadoObtenerLaCuenta(tarjeta));
	}
	
	@Test
	public void elCajeroNoAceptaUnaTarjetaConUnUsuarioInvalido() {
	
		BancoMock banco = new BancoMock();
		Tarjeta tarjeta = Tarjeta.crear("Nombre de usuario invalido");
		
		assertFalse("El cajero acepta la tarjeta", new Cajero(banco).aceptaTarjeta(tarjeta));
		assertTrue("El cajero debe intentar validar la tarjeta contra el banco", banco.seHaIntentadoObtenerLaCuenta(tarjeta));
	}
}
