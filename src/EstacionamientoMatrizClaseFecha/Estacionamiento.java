package EstacionamientoMatrizClaseFecha;

import java.util.Arrays;

public class Estacionamiento {
	private static int ESPACIO = 6;
	private static int NIVEL = 8;
	private String nombre;
	private Espacio[][] espacios;
	private Registro[]registros;

	@Override
	public String toString() {
		return "Estacionamiento [nombre=" + nombre + ", espacios=" + Arrays.toString(espacios) + "]";
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estacionamiento(String nombre) {
		super();
		this.nombre = nombre;
		this.espacios = new Espacio[ESPACIO][NIVEL];
	}

	public void agregarAuto(Automovil auto, int posicion) {
		if (posicion <= NIVEL * ESPACIO && posicion >= 0) {
			Espacio espacio = new Espacio(auto);
			this.espacios[(posicion) / 10][((posicion % 10) - 1)] = espacio;
		}
	}

	public void mostrarEstacionamiento() {
		Espacio[][] e = this.espacios;
		for (int i = 0; i < ESPACIO; i++) {
			System.out.println("");
			for (int j = 0; j < NIVEL; j++) {
				System.out.println(e[i][j]);
			}
		}
	}

	public void agregarPago(Pago pago, int posicion,Fecha fechaPago) {
		if(this.espacios[(posicion) / 10][((posicion % 10) - 1)]!=null) {
		this.espacios[(posicion) / 10][((posicion % 10) - 1)].agregarPago(pago,fechaPago);
		}
	}

	public void retirar(int posicion) {
		Espacio esp=this.espacios[(posicion) / 10][((posicion % 10) - 1)];
		if(esp==null) {
			System.out.println("No existe Auto en dicho espcio");
		}else if(esp.verificarRetiroEnRegistro()!=null){
				System.out.println("Auto ya se retiro");
			}else if(esp.verificarPagosAlDia()) {
				System.out.println("No puede retirar por que tiene poagos pendientes");;
			}else {
				this.generarAgenda(esp.damePatentes() , esp.dameFecha());
			}
		}

	private Registro generarAgenda(String damePatentes, Fecha dameFecha) {
	Registro registros = null;
		registros=new Registro(damePatentes,dameFecha);
		return registros;
	}
	}


