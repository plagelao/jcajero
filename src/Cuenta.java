
public class Cuenta {

	public static final Cuenta CUENTA_INVALIDA = new Cuenta(null);
	private final String token;
	
	public static Cuenta crear(String token) {
		return new Cuenta(token);
	}

	private Cuenta(String token) {
		this.token = token;
		
	}

	public String token() {
		return token;
	}
}
