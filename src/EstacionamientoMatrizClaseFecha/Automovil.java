package EstacionamientoMatrizClaseFecha;

import java.util.Arrays;

public class Automovil {
private final static int CANT_PAGOS=12;
public Automovil(String patente, Fecha fechaIngreso) {
	super();
	this.patente = patente;
	this.fechaIngreso = fechaIngreso;
	this.pagos =new Pago[CANT_PAGOS];
}
public String getPatente() {
	return patente;
}
private void setPatente(String patente) {
	this.patente = patente;
}
public Fecha getFechaIngreso() {
	return fechaIngreso;
}
private void setFechaIngreso(Fecha fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}
@Override
public String toString() {
	return "Automovil [patente=" + patente + ", fechaIngreso=" + fechaIngreso + ", pagos=" + Arrays.toString(pagos)
			+ "]";
}
private String patente;
private Fecha fechaIngreso;
private Pago[]pagos;
public void agregarPago(Pago pago,Fecha fechaPago) {
	pagos[fechaPago.getMes()-1]=pago;
	
}
public boolean verificarPagosAlDia() {
	boolean Pago=false;
	int i=0;
	while(i<this.pagos.length && !Pago) {
		Pago=this.pagos[i]!=null;
	}
	return Pago;
} 

}
