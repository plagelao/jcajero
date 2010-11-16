public class GeneradorSaldo {

	public int crear(String json) {
		String saldo = null;
		if (json.contains("balance:")) {
			int posTokenInicial = json.indexOf("\"", json.indexOf("balance:")) + 1;
			int posTokenFinal = json.indexOf("\"", posTokenInicial + 1);
			saldo = json.substring(posTokenInicial, posTokenFinal);
		}
		return Integer.parseInt(saldo);
	}

}
