package MuldialDeFutbol;

import java.util.Arrays;

public class Seleccion {
public final static int CANT_TOT=23;
public final static int CANT_TIT=11;
public final static int CANT_SUP=7;
public final static int CANT_RES=5;
public Seleccion(String nombre) {
	super();
	this.nombre = nombre;
	this.listaDeJugadores = new Jugador[CANT_TOT];
}
private String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Seleccion [nombre=" + nombre + ", listaDeJugadores=" + Arrays.toString(listaDeJugadores) + "]";
}
private String nombre;
private Jugador[]listaDeJugadores;
public void cambio(int nro1, int nro2) {
	int idx1;
	int idx2;
	if((this.validarNro(nro1) && this.validarNro(nro2)) && nro1 != nro2 ) {
		idx1=obtenerPosicion(nro1);
		idx2=obtenerPosicion(nro2);
		this.intercambiarJugadores(idx1,idx2);
 	}
}
private void intercambiarJugadores(int idx1, int idx2) {
	Jugador jug=this.listaDeJugadores[idx1];
	this.listaDeJugadores[idx1]=this.listaDeJugadores[idx2];
	this.listaDeJugadores[idx2]=jug;
}
private int obtenerPosicion(int nro) {
	int i=0;
	boolean seEncontro=false;
	while(i<this.listaDeJugadores.length && !seEncontro) {
		seEncontro=this.listaDeJugadores[i].getNroCamiseta()==nro;
		i++;
	}
	return i-1;
}
private boolean validarNro(int nro) {
	return nro>0 && nro<20;
}
public boolean agregarJugador(Posicion posicion, String nombre, int nro) {
	boolean seAgrego=false;
	int idxPrimerNull=this.idxPrimerNull();
	if(idxPrimerNull>-1) {
		Jugador jugador=new Jugador(posicion,nombre,nro);
		this.listaDeJugadores[idxPrimerNull]=jugador;
		seAgrego=true;
}
	return seAgrego;
	
}
private int idxPrimerNull() {
	int pos=0;
	boolean seEncontro=false;
while(pos<=this.listaDeJugadores.length && !seEncontro) {
		seEncontro=this.listaDeJugadores[pos]==null;
		pos++;
	}
	return pos-1 < this.listaDeJugadores.length? pos-1 :-1;
}
public void mostrarTitulares() {
	System.out.println("\n///////////mostrarTitulares//////////");
for(int i=0; i<CANT_TIT ;i++) {
	System.out.println(this.listaDeJugadores[i]);
}
	
}
public void mostrarSuplentes() {
	System.out.println("\n///////////mostrarSuplentes///////////");
	for(int i=CANT_TIT; i<CANT_TOT-CANT_RES ;i++) {
		System.out.println(this.listaDeJugadores[i]);
	}
}
public void mostrarOtros() {
	System.out.println("\n///////////mostrarOtros///////////");
	for(int i=CANT_TIT+CANT_SUP; i<CANT_TOT ;i++) {
		System.out.println(this.listaDeJugadores[i]);
	}
}
public void cambioPorLesion(int nro1, String nombre) {
int idxLesionado=this.buscarPorCamiseta(nro1);
if(idxLesionado>0) {
	Jugador jug=new Jugador(this.listaDeJugadores[idxLesionado].getPosicion(),nombre,this.listaDeJugadores[idxLesionado].getNroCamiseta());
	this.listaDeJugadores[idxLesionado]=jug;
}
}
private int buscarPorCamiseta(int nro1) {
	int pos=0;
	boolean seEncontro=false;
	while(pos<this.listaDeJugadores.length && !seEncontro) {
		seEncontro=this.listaDeJugadores[pos].getNroCamiseta()==nro1;
		pos++;
	}
	return pos-1<this.listaDeJugadores.length?pos-1:-1;
}

public Jugador[]obtenerReservas(){
	Jugador[]jugadoresRes=new Jugador[CANT_RES];
	int j=0;
	for(int i=CANT_TIT+CANT_SUP;i<CANT_TOT;i++) {
		jugadoresRes[j]=this.listaDeJugadores[i];
		j++;
	}
	return jugadoresRes;
	
}
public int[] cantJugadoresPorPosicion() {
	 int cantPosiciones=Posicion.values().length;
	int[]listaJugPorPosicion=new int[cantPosiciones];
	for(int i=0;i<this.listaDeJugadores.length;i++) {
		Posicion p=this.listaDeJugadores[i].getPosicion();
		listaJugPorPosicion[p.ordinal()]++;
	}
	return listaJugPorPosicion;
	
}
public void mostrarJugadoresPorPosicion(int[] listaJugPorPosicion) {
	for (int i = 0; i < listaJugPorPosicion.length; i++) {
		System.out.println(Posicion.values()[i] + ": " + cantJugadoresPorPosicion()[i]);
	}
	
}

}
