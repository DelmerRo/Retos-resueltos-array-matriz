package MuldialDeFutbol;

public class Jugador {
	private String nombre;
	private int nroCamiseta;
private Posicion posicion;
public Jugador(Posicion posicion, String nombre, int nroCamiseta) {
	super();
	this.posicion = posicion;
	this.nombre = nombre;
	this.nroCamiseta = nroCamiseta;
}
public Posicion getPosicion() {
	return posicion;
}
private void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
private String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNroCamiseta() {
	return nroCamiseta;
}
private void setNroCamiseta(int nroCamiseta) {
	this.nroCamiseta = nroCamiseta;
}
@Override
public String toString() {
	return "\nJugador [posicion=" + posicion + ", nombre=" + nombre + ", nroCamiseta=" + nroCamiseta + "]";
}

}
