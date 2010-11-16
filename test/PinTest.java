

import static junit.framework.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
		List<Digito> digitos = new ArrayList<Digito>();
		digitos.add(digito1);
		digitos.add(digito2);
		digitos.add(digito3);
		digitos.add(digito4);
		Pin pin = Pin.crearPin(digito1, digito2, digito3, digito4);
		for(int i = 0; i < digitos.size(); i++) {
			assertEquals(digitos.get(i), pin.digitos()[i]);
		}
	}
	
	
}
