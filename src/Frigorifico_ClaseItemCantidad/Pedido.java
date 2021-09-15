package Frigorifico_ClaseItemCantidad;

import java.util.ArrayList;

public class Pedido {
	private int idVendedor;
	private int CUITCliente;
	private ArrayList<ItemPedido> items;

	public Pedido(int idVendedor, int cUITCliente) {
		super();
		this.idVendedor = idVendedor;
		CUITCliente = cUITCliente;
		this.items = new ArrayList<>();
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public int getCUITCliente() {
		return CUITCliente;
	}

	@Override
	public String toString() {
		return "\n" + "\nPedido [idVendedor=" + idVendedor + ", CUITCliente=" + CUITCliente + ", items=" + items + "]";
	}

	public void agregarItemPedido(ItemPedido items2) {
		this.items.add(items2);

	}

	public double costo() {
		double costoTotal = 0;
		for (ItemPedido ip : this.items) {
			costoTotal += ip.costo();
		}
		return costoTotal;
	}

}
