public class GeneradorToken {

	private static final String TOKEN = "token\":";

	public String crear(String json) {
		String token = null;
		if (json.contains(TOKEN)) {
			int posTokenInicial = json.indexOf("\"", json.indexOf(TOKEN)
					+ TOKEN.length()) + 1;
			int posTokenFinal = json.indexOf("\"", posTokenInicial + 1);
			token = json.substring(posTokenInicial, posTokenFinal);
		}
		return token;
	}
}
