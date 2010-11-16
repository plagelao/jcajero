
public class Tarjeta {

	public final static Tarjeta TARJETA_INVALIDA = new Tarjeta();
	
	public static Tarjeta crear(String nombreUsuario) {
		if (nombreUsuarioNulo(nombreUsuario)) {
			return TARJETA_INVALIDA;
		}
		return new Tarjeta();
	}

	private static boolean nombreUsuarioNulo(String nombreUsuario) {
		return nombreUsuario == null;
	}
}
