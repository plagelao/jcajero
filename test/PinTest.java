

import static junit.framework.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class PinTest {
	private Digito digito1;
	private Digito digito2;
	private Digito digito3;
	private Digito digito4;

	@Before
	public void setup() {
		digito1 = Digito.crearDigito(3);
		digito2 = Digito.crearDigito(4);
		digito3 = Digito.crearDigito(5);
		digito4 = Digito.crearDigito(6);
	}
	
	@Test
	public void pinCreadoCorrectamenteConCuatroDigitos() {
		Digito digito = Digito.crearDigito(3);
		assertNotNull(Pin.crearPin(digito, digito, digito, digito));
	}

	@Test
	public void pinCreadoCorrespondeConPinDevuelto() {
		String digitos = crearListaDeDigitos();
		Pin pin = Pin.crearPin(digito1, digito2, digito3, digito4);
		assertEquals(digitos, pin.digitos());
	}

	private String crearListaDeDigitos() {
		return new StringBuilder()
				.append(digito1.valor())
				.append(digito2.valor())
				.append(digito3.valor())
				.append(digito4.valor())
				.toString();
	}
	
}
