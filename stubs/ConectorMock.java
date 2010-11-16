public class ConectorMock implements Conector {

	private String urlChallenge;
	private final int saldoDeLaCuenta;

	public ConectorMock(int saldoDeLaCuenta) {
		this.saldoDeLaCuenta = saldoDeLaCuenta;
	}

	@Override
	public String obtenerJsonDeRespuesta(String url) {
		urlChallenge = url;
		if (url.contains("challenge"))
			return "{\"token\":\"WONDERLAND\"}";
		else if (url.contains("balance"))
			return "{\"balance\":1000}";
		else
			return "";
	}

	public boolean haHechoUnSendA(String expectedUrl) {
		return urlChallenge.equals(expectedUrl);
	}

}
