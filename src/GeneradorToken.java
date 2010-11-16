
public class GeneradorToken {

	public String crear(String json) {
		String token=null;
		if (json.contains("token:")) {
			int posTokenInicial = json.indexOf("\"",json.indexOf("token:")) +1;
			int posTokenFinal = json.indexOf("\"",posTokenInicial+1);
			token = json.substring(posTokenInicial,posTokenFinal);
		}
		return token;
	}
}
