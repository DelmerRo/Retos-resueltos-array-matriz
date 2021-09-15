package Frigorifico_ClaseItemCantidad;

public class Vendedor {
	private int idVendedor;
	private String nombre;

	public Vendedor(int idVendedor, String nombre) {
		super();
		this.idVendedor = idVendedor;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "\nVendedor [idVendedor=" + idVendedor + ", nombre=" + nombre + "]";
	}
}
