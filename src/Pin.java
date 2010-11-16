

import java.util.ArrayList;
import java.util.List;

public class Pin {

	private List<Digito> digitos = new ArrayList<Digito>();
	
	private Pin anyadirDigito(Digito digito) {
		digitos.add(digito);
		return this;
	}

	public static Pin crearPin(Digito digito1, Digito digito2, Digito digito3,
			Digito digito4) {
		return new Pin().anyadirDigito(digito1)
						.anyadirDigito(digito2)
						.anyadirDigito(digito3)
						.anyadirDigito(digito4);
	}

	public Digito[] digitos() {
		return digitos.toArray(new Digito[digitos.size()]);
	}

}
