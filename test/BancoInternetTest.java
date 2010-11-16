import static org.junit.Assert.*;

import org.junit.Test;



public class BancoInternetTest {

	ConectorMock conectorHttp = new ConectorMock();
	BancoInternet banco = new BancoInternet(conectorHttp, new GeneradorToken());

	@Test
	public void dadaUnaTarjetaValidaEsCapazDeConstruirLaUrlDeChallenge() {
		banco.obtenerCuenta(new Tarjeta("alice"));
		assertTrue(conectorHttp.haHechoUnSendA("debit_card/challenge?card=alice"));
	}

	@Test
	public void dadaUnaTarjetaValidaEsCapazDeRecibirToken() {
		Cuenta cuenta = banco.obtenerCuenta(new Tarjeta("alice"));
		assertEquals("WONDERLAND", cuenta.token());
	}

	
}
