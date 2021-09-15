package AerolineaMatricesAsignar;

public class Asiento {
	private Estado estado;
	private int nroAsiento;
	public Asiento(Estado estado, int nroAsiento) {
		super();
		this.estado = estado;
		this.nroAsiento = nroAsiento;
	}
	
	public Estado getEstado() {
		return estado;
	}
	private void setEstado(Estado estado) {
		this.estado = estado;
	}
	public int getNroAsiento() {
		return nroAsiento;
	}
	private void setNroAsiento(int nroAsiento) {
		this.nroAsiento = nroAsiento;
	}

	@Override
	public String toString() {
		return "Asiento [estado=" + estado + ", nroAsiento=" + nroAsiento  + "]";
	}

	public void actualizarEstadoAsiento() {
		this.estado=Estado.RESERVADO;
		
	}

}
