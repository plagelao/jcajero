
public class ConectorMock implements Conector {

	private String urlChallenge;

	@Override
	public String obtenerJsonDeRespuesta(String url) {
		urlChallenge = url;
		return "{token: \"WONDERLAND\"}";
	}

	public boolean haHechoUnSendA(String expectedUrl) {
		return urlChallenge.equals(expectedUrl);
	}

}
