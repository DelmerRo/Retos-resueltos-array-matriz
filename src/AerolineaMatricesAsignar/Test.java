package AerolineaMatricesAsignar;

public class Test {
	public static void main(String[] args) {

		Avion avion=new Avion("Aerocondor");

Reserva reserva1=new Reserva("A01", 1111, 01);
Reserva reserva2=new Reserva("A02", 2222, 70);
Reserva reserva3=new Reserva("A03", 3333, 03);
Reserva reserva4=new Reserva("A04", 4444, 15);
Reserva reserva5=new Reserva("A05", 5555, 05);
Reserva reserva6=new Reserva("A06", 6666, 38);
Reserva reserva7=new Reserva("A07", 7777, 90);

avion.agregarReserva(reserva1);
avion.agregarReserva(reserva2);
avion.agregarReserva(reserva3);
avion.agregarReserva(reserva4);
avion.agregarReserva(reserva5);
avion.agregarReserva(reserva6);
avion.agregarReserva(reserva7);

avion.construirMatriz();
avion.mostrarAsientos();
System.out.println("");
avion.asignar();
avion.mostrarAsientos();
System.out.println("\nnro de asientos libres con ventanilla: "+avion.asientosLibresConVentanilla());
}
}