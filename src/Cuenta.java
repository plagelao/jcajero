
public class Cuenta {

	public static final Cuenta CUENTA_INVALIDA = new Cuenta();
	
	public static Cuenta crear() {
		return new Cuenta();
	}

	private Cuenta() {
		
	}
}
