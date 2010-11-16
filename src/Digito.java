

public class Digito {

	private int valor;

	public Digito(int numero) {
		valor = numero;
	}

	public static Digito crearDigito(int numero) {
		if (esMenorQueCero(numero) || esMayorQueNueve(numero)) {
			throw new IllegalArgumentException();
		}
		return new Digito(numero);
	}

	private static boolean esMayorQueNueve(int numero) {
		return numero > 9;
	}

	private static boolean esMenorQueCero(int numero) {
		return numero < 0;
	}

	public int valor() {
		return valor;
	}

	@Override
	public boolean equals(Object digitoObj) {
		Digito digito = (Digito) digitoObj;
		if (digito == null || digito.valor() != valor){
			return false;
		}
		return true;
	}
	
	
	
}
