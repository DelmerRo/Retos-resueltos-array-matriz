package Empresa_De_Camiones_Matrices;

public class Test {
	public static void main(String[] args) {
		Empresa emp = new Empresa("Cart");
		Viaje viaje = new Viaje(5000, 00, "00");
		Viaje viaje1 = new Viaje(10000, 01, "11");
		Viaje viaje2 = new Viaje(20000, 02, "22");
		Viaje viaje3 = new Viaje(30000, 03, "33");
		Viaje viaje4 = new Viaje(40000, 04, "44");

		Camion camion = new Camion(00, 200);
		Camion camion1 = new Camion(01, 100);
		Camion camion2 = new Camion(02, 150);
		Camion camion3 = new Camion(03, 200);
		Camion camion4 = new Camion(04, 250);

		Chofer chofer = new Chofer("00", "Ricardo", 90);
		Chofer chofer1 = new Chofer("11", "Joge", 50);
		Chofer chofer2 = new Chofer("22", "Zacarias", 100);
		Chofer chofer3 = new Chofer("22", "Melgar", 100);
		Chofer chofer4 = new Chofer("33", "Lucho", 150);
		Chofer chofer5 = new Chofer("33", "Manuel", 150);
		Chofer chofer6 = new Chofer("44", "Jeremias", 200);
		Chofer chofer7 = new Chofer("44", "Isaac", 200);
		Chofer chofer8 = new Chofer("55", "Mena", 250);
		Chofer chofer9 = new Chofer("55", "Minu", 250);

		emp.agregarViaje(viaje);
		emp.agregarViaje(viaje1);
		emp.agregarViaje(viaje2);
		emp.agregarViaje(viaje3);
		emp.agregarViaje(viaje4);
		emp.mostrarViajes();

		emp.agregarCamion(camion);
		emp.agregarCamion(camion1);
		emp.agregarCamion(camion2);
		emp.agregarCamion(camion3);
		emp.agregarCamion(camion4);
		emp.mostrarCamiones();

		emp.agregarChofer(chofer);
		emp.agregarChofer(chofer1);
		emp.agregarChofer(chofer2);
		emp.agregarChofer(chofer3);
		emp.agregarChofer(chofer4);
		emp.agregarChofer(chofer5);
		emp.agregarChofer(chofer6);
		emp.agregarChofer(chofer7);
		emp.agregarChofer(chofer8);
		emp.agregarChofer(chofer9);
		emp.mostrarChoferes();
		emp.obtenerCostosDeViajes();
		for (double d : emp.obtenerCostosDeViajes()) {
			System.out.println(d);
		}
		emp.obtenerViajesXChoferCamion();
	}
}
