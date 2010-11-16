public class GeneradorSaldo {

	private static final String BALANCE = "balance\":";

	public Saldo crear(String json) {
		String saldo = null;
		if (json.contains(BALANCE)) {
			int posTokenInicial = json.indexOf(":") + 1;
			int posTokenFinal = json.length() - 1;
			saldo = json.substring(posTokenInicial, posTokenFinal);
		}
		return new Saldo(Integer.parseInt(saldo));
	}

}
