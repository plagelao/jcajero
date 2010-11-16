public class Saldo {

	private final int saldo;

	public Saldo(int saldo) {
		this.saldo = saldo;
	}

	public int cantidad() {
		return saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + saldo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saldo other = (Saldo) obj;
		if (saldo != other.saldo)
			return false;
		return true;
	}

}
