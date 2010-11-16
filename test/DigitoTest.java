

import static junit.framework.Assert.*;

import org.junit.Test;

public class DigitoTest {

	@Test
	public void digitoCreadoSiMenorQueDiezYMayorQueCero() {
		assertNotNull(Digito.crearDigito(5));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void digitoNoCreadoSiMenorQueCero() {
		Digito.crearDigito(-1);
		fail();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void digitoNoCreadoSiMayorQueNueve() {
		Digito.crearDigito(10);
		fail();
	}
	
	@Test
	public void digitoCorrectoSiNumeroCreadoIgualNumeroIntroducido() {
		Digito digito = Digito.crearDigito(7);
		assertEquals(7, digito.valor());
	}
	
	@Test
	public void digitosConElMismoNumeroSonIguales() {
		Digito digito = Digito.crearDigito(7);
		assertEquals(digito, Digito.crearDigito(7));
	}
	
	@Test
	public void digitosConDistintoNumeroSonDistintos() {
		Digito digito = Digito.crearDigito(7);
		assertFalse(digito.equals(Digito.crearDigito(6)));
	}
}
