package EstacionamientoMatrizClaseFecha;

public class Espacio {
	private Automovil automovil;

	public Espacio(Automovil automovil) {
		super();
		this.automovil = automovil;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	private void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	@Override
	public String toString() {
		return "Espacio [automovil=" + automovil + "]";
	}

	public void agregarAutoAEspacio(Automovil auto) {
	
		this.automovil=auto;
		
	}

	public void agregarPago(Pago pago,Fecha FechaPago) {
		this.automovil.agregarPago(pago,FechaPago);
		
	}

	public Registro[] verificarRetiroEnRegistro() {
		
		return null;
	}

	public boolean verificarPagosAlDia() {
		return this.automovil.verificarPagosAlDia();
	}

	public String damePatentes() {
		return this.automovil.getPatente();
	}

	public Fecha dameFecha() {
		// TODO Auto-generated method stub
		return this.automovil.getFechaIngreso();
	}
}
