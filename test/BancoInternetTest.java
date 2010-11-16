import static org.junit.Assert.*;

import org.junit.Test;



public class BancoInternetTest {

	@Test
	public void dadaUnaTarjetaValidaEsCapazDeConstruirLaUrlDeChallenge() {
		ConectorMock conectorHttp = new ConectorMock();
		BancoInternet banco = new BancoInternet(conectorHttp, new GeneradorToken());

		banco.obtenerCuenta(new Tarjeta("alice"));
		
		assertTrue(conectorHttp.haHechoUnSendA("debit_card/challenge?card=alice"));
	}

	@Test
	public void dadaUnaTarjetaValidaEsCapazDeRecibirToken() {
		ConectorMock conectorHttp = new ConectorMock();
		BancoInternet banco = new BancoInternet(conectorHttp, new GeneradorToken());

		Cuenta cuenta = banco.obtenerCuenta(new Tarjeta("alice"));
		
		assertEquals("WONDERLAND", cuenta.token());
	}

	
}
