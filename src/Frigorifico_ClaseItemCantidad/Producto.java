package Frigorifico_ClaseItemCantidad;

public class Producto {
	private String codProd;
	private String nombre;
	private double precio;

	public Producto(String codProd, String nombre, double precio) {
		super();
		this.codProd = codProd;
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "\nProducto [codProd=" + codProd + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
