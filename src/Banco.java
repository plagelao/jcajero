public class Banco {

	private final Conector conectorHttp;
	private final GeneradorToken generadorToken;

	public Banco(Conector conectorHttp, GeneradorToken generadorToken) {
		this.conectorHttp = conectorHttp;
		this.generadorToken = generadorToken;
	}

	public Cuenta obtenerCuenta(String usuario, Pin pin) {
		String json = conectorHttp
				.obtenerJsonDeRespuesta("debit_card/challenge?card=" + usuario
						+ "&pin=" + pin.digitos());
		return Cuenta.crear(crearToken(json));
	}

	private String crearToken(String json) {
		return generadorToken.crear(json);
	}
}
