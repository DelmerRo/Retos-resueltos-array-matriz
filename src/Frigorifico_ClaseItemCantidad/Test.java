package Frigorifico_ClaseItemCantidad;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Frigorifico frigo = new Frigorifico("FrioMax");

		Cliente cliente = new Cliente("Coto", 11111, 1234, Pais.CHILE);
		Cliente cliente1 = new Cliente("Carre", 22222, 1235, Pais.CHILE);
		Cliente cliente2 = new Cliente("Coto", 33333, 1236, Pais.URUGUAY);
		Cliente cliente3 = new Cliente("Coto", 44444, 1237, Pais.URUGUAY);
		Cliente cliente4 = new Cliente("Coto", 55555, 1238, Pais.ARGENTINA);
		Cliente cliente5 = new Cliente("Coto", 66666, 1238, Pais.ARGENTINA);
		Cliente cliente6 = new Cliente("Coto", 77777, 1238, Pais.ARGENTINA);
		Cliente cliente7 = new Cliente("Coto", 88888, 1238, Pais.ARGENTINA);
		

		Vendedor vendedor = new Vendedor(00, "Jorge");
		Vendedor vendedor1 = new Vendedor(01, "Mena");

		Producto producto = new Producto("4501", "Arroz", 50);
		Producto producto1 = new Producto("4502", "Fideos", 60);
		Producto producto2 = new Producto("4503", "Galleta", 70);
		Producto producto3 = new Producto("4504", "Atun", 100);
		Producto producto4 = new Producto("4505", "Aceite", 100);
		Producto producto5 = new Producto("4506", "pan", 25);
		Producto producto6 = new Producto("4507", "Menestra", 11);

		Pedido pedido = new Pedido(00, 11111);
		Pedido pedido1 = new Pedido(01, 22222);
		Pedido pedido2 = new Pedido(01, 22222);
		Pedido pedido3 = new Pedido(01, 33333);
		Pedido pedido4 = new Pedido(01, 44444);
		Pedido pedido5 = new Pedido(01, 55555);

		ItemPedido items = new ItemPedido(5, producto1);
		ItemPedido items1 = new ItemPedido(3, producto1);
		ItemPedido items2 = new ItemPedido(2, producto2);
		ItemPedido items3 = new ItemPedido(1, producto3);
		ItemPedido items4 = new ItemPedido(1, producto6);
		ItemPedido items5 = new ItemPedido(1, producto5);
		ItemPedido items6 = new ItemPedido(1, producto4);
		ItemPedido items7 = new ItemPedido(1, producto4);
		

		frigo.agregarCliente(cliente);
		frigo.agregarCliente(cliente1);
		frigo.agregarCliente(cliente2);
		frigo.agregarCliente(cliente3);
		frigo.agregarCliente(cliente4);
		frigo.agregarCliente(cliente5);
		frigo.agregarCliente(cliente6);
		frigo.agregarCliente(cliente7);

		frigo.agregarProducto(producto);
		frigo.agregarProducto(producto1);
		frigo.agregarProducto(producto2);
		frigo.agregarProducto(producto3);
		frigo.agregarProducto(producto4);
		frigo.agregarProducto(producto5);
		frigo.agregarProducto(producto6);

		frigo.agregarVendedor(vendedor);
		frigo.agregarVendedor(vendedor1);

		frigo.agregarPedido(pedido);
		frigo.agregarPedido(pedido1);
		frigo.agregarPedido(pedido2);
		frigo.agregarPedido(pedido3);
		frigo.agregarPedido(pedido4);
		frigo.agregarPedido(pedido5);

		pedido.agregarItemPedido(items);
		pedido1.agregarItemPedido(items1);
		pedido1.agregarItemPedido(items2);
		pedido2.agregarItemPedido(items7);
		pedido2.agregarItemPedido(items3);
		pedido4.agregarItemPedido(items4);
		pedido3.agregarItemPedido(items5);
		pedido5.agregarItemPedido(items6);

		System.out.println(frigo);

		frigo.informarCantPedidos();
		System.out.println("\n" + "\nClientes por pais");
		System.out.println(Arrays.toString(frigo.clientesPorPais()));

		System.out.println("\nPais Mas Rentable: " + frigo.paisMasRentable());
	}
}
