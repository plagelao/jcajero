
class TarjetaInvalida extends Tarjeta {

	TarjetaInvalida(){
		super(null);
	}
	
	@Override
	public String usuario() {
		throw new IllegalStateException();
	}
	
}
