
public class BancoInternet implements Banco {

	private final Conector conectorHttp;
	private final GeneradorToken generadorToken;

	public BancoInternet(Conector conectorHttp, GeneradorToken generadorToken) {
		this.conectorHttp = conectorHttp;
		this.generadorToken = generadorToken;
	}

	@Override
	public Cuenta obtenerCuenta(Tarjeta tarjeta) {
		String json = conectorHttp.obtenerJsonDeRespuesta("debit_card/challenge?card=" + tarjeta.usuario());
		return Cuenta.crear(crearToken(json));
	}

	private String crearToken(String json) {
		return generadorToken.crear(json);
	}
}
