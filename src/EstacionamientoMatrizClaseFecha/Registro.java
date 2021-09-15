package EstacionamientoMatrizClaseFecha;

public class Registro {
private String patente;
private Fecha fechaRetiro;
public Registro(String patente, Fecha fechaRetiro) {
	super();
	this.patente = patente;
	this.fechaRetiro = fechaRetiro;
}
public String getPatente() {
	return patente;
}
private void setPatente(String patente) {
	this.patente = patente;
}
public Fecha getFechaRetiro() {
	return fechaRetiro;
}
private void setFechaRetiro(Fecha fechaRetiro) {
	this.fechaRetiro = fechaRetiro;
}
@Override
public String toString() {
	return "Registro [patente=" + patente + ", fechaRetiro=" + fechaRetiro + "]";
}
}
