package AerolineaMatricesAsignar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Avion {
	private final static int FILA = 16;
	private final static int COLUMNA = 6;
	private String marca;
	private Asiento[][] asientos;
	private ArrayList<Reserva> reservas;

	public Avion(String marca) {
		super();
		this.marca = marca;
		this.asientos = new Asiento[FILA][COLUMNA];
		this.reservas = new ArrayList<>();
	}

	public Asiento[][] construirMatriz() {
		Asiento[][] asient = this.asientos;
		int nroAsiento = 0;
		for (int i = 0; i < FILA; i++) {
			for (int j = 0; j < COLUMNA; j++) {
				nroAsiento++;
				asient[i][j] = new Asiento(Estado.LIBRE, nroAsiento);
			}
		}
		return asient;

	}

	public void mostrarAsientos() {
		Asiento[][] asient = this.asientos;
		for (int i = 0; i < FILA; i++) {
			System.out.println("");
			for (int j = 0; j < COLUMNA; j++) {
				System.out.print(" " + asient[i][j]);
			}
		}

	}

	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private Asiento[][] getAsientos() {
		return asientos;
	}

	private void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", asientos=" + Arrays.toString(asientos) + ", reservas=" + reservas + "]";
	}

	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);

	}

	public void asignar() {
		for (Reserva r : this.reservas) {
			this.cambiarEstado(r.getNroAsiento());
		}

	}

	private void cambiarEstado(int nroAsiento) {
		int fila = (nroAsiento - 1) / COLUMNA;
		int columna = (nroAsiento - 1) % COLUMNA;
		this.asientos[fila][columna].actualizarEstadoAsiento();
	}

	public int asientosLibresConVentanilla() {
		int cont = 0;
		for (int i = 0; i < FILA; i++) {
			for (int j = 0; j < COLUMNA; j =j+ 5) {
				if (this.asientos[i][j].getEstado().equals(Estado.LIBRE)) {
					cont++;
				}
			}
		}
		return cont;

	}

}
