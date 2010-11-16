

public class Pin {

	private StringBuilder digitos = new StringBuilder();
	
	private Pin anyadirDigito(Digito digito) {
		digitos.append(digito.valor());
		return this;
	}

	public static Pin crearPin(Digito digito1, Digito digito2, Digito digito3,
			Digito digito4) {
		return new Pin().anyadirDigito(digito1)
						.anyadirDigito(digito2)
						.anyadirDigito(digito3)
						.anyadirDigito(digito4);
	}

	public String digitos() {
		return digitos.toString();
	}

}
