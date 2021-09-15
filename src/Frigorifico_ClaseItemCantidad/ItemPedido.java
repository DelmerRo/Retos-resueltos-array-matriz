package Frigorifico_ClaseItemCantidad;

public class ItemPedido {
	private int cantidad;
	private Producto producto;

	@Override
	public String toString() {
		return "\nItemPedido [cantidad=" + cantidad + ", producto=" + producto + "]";
	}

	public int getCantidad() {
		return cantidad;
	}

	public Producto getProducto() {
		return producto;
	}
	
	public ItemPedido(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public double costo() {
		return this.cantidad * this.producto.getPrecio();
	}
}
