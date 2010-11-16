public class Cuenta {

	public static final Cuenta CUENTA_INVALIDA = new Cuenta(null, null, null);
	private final String token;
	private final Conector conector;
	private final GeneradorSaldo generadorSaldo;

	public static Cuenta crear(String token, Conector conector) {
		return new Cuenta(token, conector, new GeneradorSaldo());
	}

	private Cuenta(String token, Conector conector,
			GeneradorSaldo generadorSaldo) {
		this.token = token;
		this.conector = conector;
		this.generadorSaldo = generadorSaldo;

	}

	public String token() {
		return token;
	}

	public int consultarSaldo() {
		String json = conector
				.obtenerJsonDeRespuesta("debit_card/balance?token=" + token);
		return generadorSaldo.crear(json);
	}

}
