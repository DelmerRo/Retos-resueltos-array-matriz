package Frigorifico_ClaseItemCantidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Frigorifico {
	private static final int CANT_VEND = 20;
	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Cliente> clientes;
	private Vendedor[] vendedores;
	private ArrayList<Pedido> pedidos;
	
	public Frigorifico(String nombre) {
		super();
		this.nombre = nombre;
		this.productos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		this.vendedores = new Vendedor[CANT_VEND];
	}

	public void informarCantPedidos() {
		int[][] CantPedidosXVendPais;
		Pais[] paises = Pais.values();
		CantPedidosXVendPais = new int[this.vendedores.length - 1][paises.length];
		for (Pedido pedido : this.pedidos) {
			int iVendedor = pedido.getIdVendedor();
			int iPais = obtenerPosicionDePais(pedido.getCUITCliente());
			CantPedidosXVendPais[iVendedor][iPais]++;
		}
		mostrarCantPedidosXVendPais(CantPedidosXVendPais);
	}

	private void mostrarCantPedidosXVendPais(int[][] cantPedidosXVendPais) {
		for (Pais pais : Pais.values()) {
			System.out.print("     " + pais);
		}
		for (int i = 0; i < cantPedidosXVendPais.length; i++) {
			if (this.vendedores[i] != null) {
				System.out.print("\n" + this.vendedores[i].getNombre() + ": ");
				for (int j = 0; j < cantPedidosXVendPais[i].length; j++) {
					System.out.print("        " + cantPedidosXVendPais[i][j]);
				}
			}
		}

	}

	private int obtenerPosicionDePais(int cuitCliente) {
		int posicion = 0;
		boolean seEncontro = false;
		while (posicion < this.clientes.size() && !seEncontro) {
			seEncontro = this.clientes.get(posicion).getCUITCliente() == (cuitCliente);
			posicion++;
		}
		return posicion - 1 < this.clientes.size() ? this.clientes.get(posicion - 1).obtenerPosicionPais() : -1;
	}

	public int[] clientesPorPais() {
		int[] cant;
		Pais[] paises;
		paises = Pais.values();
		cant = new int[paises.length];
		for (int i = 0; i < this.clientes.size(); i++) {
			int idxPais = this.clientes.get(i).getPais().ordinal();
			cant[idxPais]++;
		}
		return cant;
	}

	@Override
	public String toString() {
		return "Frigorifico [nombre=" + nombre + ",\n productos=" + productos + ", \n clientes=" + clientes
				+ ",\n vendedores=" + Arrays.toString(vendedores) + ",\n pedidos=" + pedidos + "]";
	}

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public void agregarVendedor(Vendedor vendedor) {
		int idxPrimerNull = this.obtenerPosicionPrimerNull();
		if (idxPrimerNull >= 0) {
			this.vendedores[idxPrimerNull] = vendedor;
		}
	}

	private int obtenerPosicionPrimerNull() {
		int posicion = 0;
		boolean seEncontro = false;
		while (posicion < this.vendedores.length && !seEncontro) {
			seEncontro = this.vendedores[posicion] == null;
			posicion++;
		}
		return posicion - 1 < this.vendedores.length ? posicion - 1 : -1;
	}

	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public Pais paisMasRentable() {
		Pais paisMax = null;
		double recaudacionMaxima = Integer.MIN_VALUE;
		double[] recauTotal = this.recaudacionTotal();
		for (int posicion = 0; posicion < recauTotal.length; posicion++) {
			if (recauTotal[posicion] > recaudacionMaxima) {
				recaudacionMaxima = recauTotal[posicion];
				paisMax = Pais.values()[posicion];
			}
		}
		return paisMax;
	}

	private double[] recaudacionTotal() {
		double[] montoPorPais = new double[Pais.values().length];
		;
		for (Pedido p : this.pedidos) {
			int posicion = this.obtenerPosicionDePais(p.getCUITCliente());
			montoPorPais[posicion] += p.costo();
		}

		return montoPorPais;
	}

}
