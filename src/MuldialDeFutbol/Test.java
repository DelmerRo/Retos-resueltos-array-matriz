package MuldialDeFutbol;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
Seleccion seleccion=new Seleccion("Argentina");
seleccion.agregarJugador(Posicion.ARQUERO,"hila",1);
seleccion.agregarJugador(Posicion.ARQUERO,"Mario",2);
seleccion.agregarJugador(Posicion.DEFENSOR,"Jorge",3);
seleccion.agregarJugador(Posicion.DEFENSOR,"Nuñez",4);
seleccion.agregarJugador(Posicion.DEFENSOR,"Pablño",5);
seleccion.agregarJugador(Posicion.DEFENSOR,"Jonas",6);
seleccion.agregarJugador(Posicion.DELANTERO,"Vivald",7);
seleccion.agregarJugador(Posicion.DELANTERO,"June",8);
seleccion.agregarJugador(Posicion.DELANTERO,"Fabe",9);
seleccion.agregarJugador(Posicion.MEDIOCAMPISTA,"Nino",10);
seleccion.agregarJugador(Posicion.MEDIOCAMPISTA,"Moli",11);

seleccion.agregarJugador(Posicion.ARQUERO,"Okd",12);
seleccion.agregarJugador(Posicion.ARQUERO,"Mens",13);
seleccion.agregarJugador(Posicion.DEFENSOR,"Matild",14);
seleccion.agregarJugador(Posicion.DEFENSOR,"Lucas",15);
seleccion.agregarJugador(Posicion.DELANTERO,"Juan",16);
seleccion.agregarJugador(Posicion.DELANTERO,"Max",17);
seleccion.agregarJugador(Posicion.MEDIOCAMPISTA,"Fax",18);

seleccion.agregarJugador(Posicion.ARQUERO,"Weill",19);
seleccion.agregarJugador(Posicion.DEFENSOR,"Menis",20);
seleccion.agregarJugador(Posicion.DELANTERO,"Pol",21);
seleccion.agregarJugador(Posicion.MEDIOCAMPISTA,"Mery",22);
seleccion.agregarJugador(Posicion.DELANTERO,"Mansdj",23);
seleccion.mostrarTitulares();
seleccion.mostrarSuplentes();
seleccion.mostrarOtros();

seleccion.cambio( 1,10);
seleccion.mostrarTitulares();

seleccion.cambioPorLesion(3,"Martinez");
seleccion.mostrarTitulares();

System.out.println(Arrays.asList(seleccion.obtenerReservas()));

seleccion.mostrarJugadoresPorPosicion(seleccion.cantJugadoresPorPosicion());
	}
}
