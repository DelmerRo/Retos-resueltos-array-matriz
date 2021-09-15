package Pyme_Empleado_Agregar_Con_Eficiencia;

public class Empleado {
private String dni;
private String apellido;
private double sueldo;
public Empleado(String dni, String apellido, double sueldo) {
	super();
	this.dni = dni;
	this.apellido = apellido;
	this.sueldo = sueldo;
}
@Override
public String toString() {
	return "Empleado [dni=" + dni + ", apellido=" + apellido + ", sueldo=" + sueldo + "]";
}
public String getDni() {
	return dni;
}
private void setDni(String dni) {
	this.dni = dni;
}
private String getApellido() {
	return apellido;
}
private void setApellido(String apellido) {
	this.apellido = apellido;
}
public double getSueldo() {
	return sueldo;
}
private void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}

}
