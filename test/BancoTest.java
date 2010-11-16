import static org.junit.Assert.*;

import org.junit.Test;



public class BancoTest {

	ConectorMock conectorHttp = new ConectorMock();
	Banco banco = new Banco(conectorHttp, new GeneradorToken());

	@Test
	public void dadaUnaTarjetaValidaEsCapazDeConstruirLaUrlDeChallenge() {
		banco.obtenerCuenta("alice", obtenerPin());
		assertTrue(conectorHttp.haHechoUnSendA("debit_card/challenge?card=alice&pin=7643"));
	}

	private Pin obtenerPin() {
		Digito digito1 = Digito.crearDigito(7);
		Digito digito2 = Digito.crearDigito(6);
		Digito digito3 = Digito.crearDigito(4);
		Digito digito4 = Digito.crearDigito(3);
		return Pin.crearPin(digito1, digito2, digito3, digito4);
	}

	@Test
	public void dadaUnaTarjetaValidaEsCapazDeRecibirToken() {
		Cuenta cuenta = banco.obtenerCuenta("alice", obtenerPin());
		assertEquals("WONDERLAND", cuenta.token());
	}

	
}
