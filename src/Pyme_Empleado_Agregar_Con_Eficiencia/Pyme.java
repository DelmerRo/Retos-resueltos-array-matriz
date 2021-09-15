package Pyme_Empleado_Agregar_Con_Eficiencia;

import java.util.Arrays;

public class Pyme {
	public static final int CANT_EMPLEADOS = 6;
	private String nombre;
	Empleado[] nominaEmpleados;

	public Pyme(String nombre) {
		super();
		this.nombre = nombre;
		this.nominaEmpleados = new Empleado[CANT_EMPLEADOS];
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pyme [nombre=" + nombre + ", nominaEmpleados=" + Arrays.toString(nominaEmpleados) + "]";
	}

	public int altaEmpleado(String dni, String apellido, double sueldo) {
		int posicion;
		posicion = idxPrimerNull();
		if (posicion > -1) {
			Empleado empleado = new Empleado(dni, apellido, sueldo);
			this.nominaEmpleados[posicion] = empleado;
		}
		return posicion;
	}

	private int idxPrimerNull() {
		int pos = 0;
		while (pos < this.nominaEmpleados.length && this.nominaEmpleados[pos] != null) {
			pos++;
		}
		return pos < this.nominaEmpleados.length ? pos : -1;
	}

	public Empleado bajaDeEmpleado(String dni) {
		int idxPosicion = 0;
		Empleado empleadoDadoBaja = null;
		idxPosicion = this.buscarIdxEmpleado(dni);
		if (idxPosicion > -1) {
			empleadoDadoBaja = this.nominaEmpleados[idxPosicion];
			this.nominaEmpleados[idxPosicion] = null;
		}
		return empleadoDadoBaja;

	}

	private int buscarIdxEmpleado(String dni) {
		int pos = 0;
		while (this.nominaEmpleados[pos] == null
				|| pos < this.nominaEmpleados.length && !this.nominaEmpleados[pos].getDni().equals(dni)) {
			pos++;
		}
		return pos < this.nominaEmpleados.length ? pos : -1;
	}

	public int cantVacantes() {
		int cant = 0;
		for (Empleado emp : this.nominaEmpleados) {
			if (emp == null) {
				cant++;
			}
		}
		return cant;
	}

	public double sueldoTotal() {
		double sueldo = 0;
		for (Empleado emp : this.nominaEmpleados) {
			if (emp != null) {
				sueldo += emp.getSueldo();
			}
		}
		return sueldo;
	}

	public Empleado bajaDeEmpleadoEficienteD(String dni) {
		int i = 0;
		Empleado empEncontrado = null;
		while (i < this.nominaEmpleados.length && this.nominaEmpleados[i] != null && empEncontrado == null) {
			if (this.nominaEmpleados[i].getDni().equals(dni)) {
				empEncontrado = this.nominaEmpleados[i];
				this.nominaEmpleados[i] = null;
			} else {
				i++;
			}
			System.out.println(i >= 0);
			System.out.println(this.nominaEmpleados[i] != null);
			System.out.println(empEncontrado == null);
		}
		this.desplazarEmpleadoALaDerecha(i);
		return empEncontrado;
	}

	private void desplazarEmpleadoALaDerecha(int i) {
		while (i < this.nominaEmpleados.length - 1 && this.nominaEmpleados[i + 1] != null) {
			this.nominaEmpleados[i] = this.nominaEmpleados[i + 1];
			i++;
		}
		if (i < this.nominaEmpleados.length) {
			this.nominaEmpleados[i] = null;
		}
	}

	public void mostrarEmpleado() {
		for (Empleado e : this.nominaEmpleados) {
			System.out.println(e);
		}

	}

	public void desplazarTodoLosNullALaDerecha() {
		for (int i = 0; i < this.nominaEmpleados.length; i++) {
			if (this.nominaEmpleados[i] == null) {
				traerObjetoAlaDerecha(i);
			}
		}
	}

	private void traerObjetoAlaDerecha(int i) {
		int j=i+1;
		boolean seEncontro = false;
		while (j < this.nominaEmpleados.length && !seEncontro) {
			if (this.nominaEmpleados[j] != null) {
				this.nominaEmpleados[i]=this.nominaEmpleados[j];
				this.nominaEmpleados[j]=null;
				seEncontro = true;
			} else {
				j++;
			}
		}
	}

}
