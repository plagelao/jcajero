
public class Cajero {

	private final Banco banco;

	public Cajero(Banco banco) {
		this.banco = banco;
	}

	public boolean aceptaTarjeta(Tarjeta tarjeta) {
		return banco.obtenerCuenta(tarjeta) != Cuenta.CUENTA_INVALIDA;
	}

}
