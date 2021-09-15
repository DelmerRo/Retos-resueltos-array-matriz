package Empresa_De_Camiones_Matrices;

public class Chofer {
	String idChofer;
	String nombre;
	double pagoPorViaje;

	public Chofer(String idChofer, String nombre, double pagoPorViaje) {
		super();
		this.idChofer = idChofer;
		this.nombre = nombre;
		this.pagoPorViaje = pagoPorViaje;
	}

	@Override
	public String toString() {
		return "Chofer [idChofer=" + idChofer + ", nombre=" + nombre + ", pagoPorViaje=" + pagoPorViaje + "]";
	}

	public String getIdChofer() {
		return idChofer;
	}

	public double getPagoPorViaje() {
		return pagoPorViaje;
	}

	public String getNombre() {
		return nombre;
	}



}
