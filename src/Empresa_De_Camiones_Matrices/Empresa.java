package Empresa_De_Camiones_Matrices;

import java.util.ArrayList;

public class Empresa {
	public static final int CANT_CAMIONES = 10;
	public static final int CANT_CHOFERES = 20;
	private String nombre;
	private Camion[] camiones;
	private Chofer[] choferes;
	private ArrayList<Viaje> viajes;

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		this.camiones = new Camion[CANT_CAMIONES];
		this.choferes = new Chofer[CANT_CHOFERES];
		this.viajes = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", camiones=" + camiones + ", choferes=" + choferes + "]";
	}

	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}

	public boolean agregarCamion(Camion camion) {
		boolean seAgrego = false;
		int idxPrimerNull = this.idxPrimerNullCamion();
		if (idxPrimerNull > -1) {
			this.camiones[idxPrimerNull] = camion;
			seAgrego = true;
		}
		return seAgrego;

	}

	private int idxPrimerNullCamion() {
		int pos = 0;
		boolean seEncontro = false;
		while (pos <= this.camiones.length && !seEncontro) {
			seEncontro = this.camiones[pos] == null;
			pos++;
		}
		return pos - 1 < this.camiones.length ? pos - 1 : -1;
	}

	private int idxPrimerNullChofer() {
		int pos = 0;
		boolean seEncontro = false;
		while (pos <= this.choferes.length && !seEncontro) {
			seEncontro = this.choferes[pos] == null;
			pos++;
		}
		return pos - 1 < this.choferes.length ? pos - 1 : -1;
	}

	public boolean agregarChofer(Chofer chofer) {
		boolean seAgrego = false;
		int idxPrimerNull = this.idxPrimerNullChofer();
		if (idxPrimerNull > -1) {
			this.choferes[idxPrimerNull] = chofer;
			seAgrego = true;
		}
		return seAgrego;

	}

	public void mostrarChoferes() {
		for (Chofer ch : this.choferes) {
			System.out.println(ch);
		}
	}

	public void mostrarViajes() {
		for (Viaje v : this.viajes) {
			System.out.println(v);
		}

	}

	public void mostrarCamiones() {
		for (Camion c : this.camiones) {
			System.out.println(c);
		}
	}

	public double[] obtenerCostosDeViajes() {
		double[] costosXViaje = new double[this.viajes.size()];
		double costoDelViaje;
		Camion elCamion = null;
		Chofer elChofer;
		for (int i = 0; i < this.viajes.size(); i++) {
			Viaje viaje = this.viajes.get(i);
			elCamion = this.camiones[viaje.getIdCamion()];
			costoDelViaje = elCamion.getCostoPorKm() + viaje.getKmsDelViaje();
			int iChofer = idxChofer(viaje.getIdChofer());
			elChofer = this.choferes[iChofer];
			costoDelViaje += elChofer.getPagoPorViaje();
			costosXViaje[i] = costoDelViaje;
			costoDelViaje = 0;
		}
		return costosXViaje;
		// TODO Auto-generated method stub

	}

	private int idxChofer(String idChofer) {
		int i = 0;
		boolean seEncontro = false;
		while (i < this.choferes.length && !seEncontro) {
			seEncontro = this.choferes[i].getIdChofer().equals(idChofer);
			i++;
		}
		return i - 1 < this.choferes.length ? i - 1 : -1;
	}

	public void obtenerViajesXChoferCamion() {
		int[][] obtenerViajesXChoferCamion;
		obtenerViajesXChoferCamion = new int[this.choferes.length][this.camiones.length];
		for (Viaje viaje : this.viajes) {
			int iChofer = idxChofer(viaje.getIdChofer());
			int iCamion = viaje.getIdCamion();
			obtenerViajesXChoferCamion[iChofer][iCamion]++;
		}
		mostrarViajesXChoferCamion(obtenerViajesXChoferCamion);

	}

	public void mostrarViajesXChoferCamion(int[][] viajeXChofer) {
		int cont = 0;
		for (int p = 0; p < viajeXChofer.length; p++) {
			if(choferes[p]!=null) {
			System.out.print(choferes[p].getNombre() + ": ");
			for (int j = 0; j < viajeXChofer[p].length; j++) {
				if (viajeXChofer[p][j] != 0) {
					cont++;
				}
			}
			System.out.println(cont);
			cont = 0;
			}
		}
	}

}
