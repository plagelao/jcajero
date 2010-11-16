import java.util.HashSet;
import java.util.Set;


public class BancoMock implements Banco {
	private Set<Tarjeta> tarjetasQueSeHanIntentadoValidar = new HashSet();

	
	public boolean seHaIntentadoObtenerLaCuenta(Tarjeta tarjeta) {
		return tarjetasQueSeHanIntentadoValidar.contains(tarjeta);
	}


	@Override
	public Cuenta obtenerCuenta(Tarjeta tarjeta) {
		tarjetasQueSeHanIntentadoValidar.add(tarjeta);
		
		if (tarjeta.usuario().equals("Nombre de usuario invalido")) {
			return Cuenta.CUENTA_INVALIDA; 
		}
		return Cuenta.crear();
	}

}
