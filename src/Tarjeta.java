
public class Tarjeta {

	public final static Tarjeta TARJETA_INVALIDA = new TarjetaInvalida();
	
	public static Tarjeta crear(String nombreUsuario) {
		if (nombreUsuarioNulo(nombreUsuario)) {
			return TARJETA_INVALIDA;
		}
		return new Tarjeta(nombreUsuario);
	}

	private static boolean nombreUsuarioNulo(String nombreUsuario) {
		return nombreUsuario == null;
	}
	
	private final String nombreUsuario;
	Tarjeta(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String usuario() {
		return nombreUsuario;
	}
}
