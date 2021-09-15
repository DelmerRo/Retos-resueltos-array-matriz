package AerolineaMatricesAsignar;

public class Reserva {
private String idReserva;
private int nroDni;
private int nroAsiento;
public Reserva(String idReserva, int nroDni, int nroAsiento) {
	super();
	this.idReserva = idReserva;
	this.nroDni = nroDni;
	this.nroAsiento = nroAsiento;
}
private String getIdReserva() {
	return idReserva;
}
private void setIdReserva(String idReserva) {
	this.idReserva = idReserva;
}
private int getNroDni() {
	return nroDni;
}
private void setNroDni(int nroDni) {
	this.nroDni = nroDni;
}
public int getNroAsiento() {
	return nroAsiento;
}
private void setNroAsiento(int nroAsiento) {
	this.nroAsiento = nroAsiento;
}
@Override
public String toString() {
	return "Reserva [idReserva=" + idReserva + ", nroDni=" + nroDni + ", nroAsiento=" + nroAsiento + "]";
}



}
