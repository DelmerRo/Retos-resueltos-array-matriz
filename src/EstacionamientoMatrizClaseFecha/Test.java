package EstacionamientoMatrizClaseFecha;

public class Test {
	public static void main(String[] args) {
Estacionamiento est=new Estacionamiento("Garag");

Fecha fecha=new Fecha(01,01,2021);
Fecha fecha1=new Fecha(12,12,2021);
Fecha fecha2=new Fecha(03,04,2021);
Fecha fecha3=new Fecha(01,01,2021);
Fecha fecha4=new Fecha(30,06,2021);
Fecha fecha5=new Fecha(05,10,2021);
Fecha fecha6=new Fecha(01,10,2021);
Fecha fecha7=new Fecha(01,01,2022);

Fecha fechaP=new Fecha(01,01,2021);
Fecha fechaP1=new Fecha(12,02,2021);
Fecha fechaP2=new Fecha(03,03,2021);
Fecha fechaP3=new Fecha(01,04,2021);
Fecha fechaP4=new Fecha(30,05,2021);
Fecha fechaP5=new Fecha(05,06,2021);
Fecha fechaP6=new Fecha(01,07,2021);


Pago pago=new Pago(1500, "1234");
Pago pago1=new Pago(1000, "1235");
Pago pago2=new Pago(2000, "1236");
Pago pago3=new Pago(1500, "1237");
Pago pago4=new Pago(1500, "1238");
Pago pago5=new Pago(3000, "1239");
Pago pago6=new Pago(4000, "1240");
Pago pago7=new Pago(3000, "1241");

Automovil auto=new Automovil("1111", fecha);
Automovil auto1=new Automovil("2222", fecha1);
Automovil auto2=new Automovil("3333", fecha2);
Automovil auto3=new Automovil("4444", fecha3);
Automovil auto4=new Automovil("5555", fecha4);
Automovil auto5=new Automovil("6666", fecha5);
Automovil auto6=new Automovil("7777", fecha6);
Automovil auto7=new Automovil("8888", fecha7);

Espacio espacio=new Espacio(auto);
Espacio espacio1=new Espacio(auto1);
Espacio espacio2=new Espacio(auto2);
Espacio espacio3=new Espacio(auto3);
Espacio espacio4=new Espacio(auto4);
Espacio espacio5=new Espacio(auto5);
Espacio espacio6=new Espacio(auto6);
Espacio espacio7=new Espacio(auto7);



est.agregarAuto(auto,5);
est.agregarAuto(auto1,12);
est.agregarAuto(auto1,11);
est.agregarAuto(auto1,21);
est.agregarAuto(auto5,17);
est.agregarAuto(auto5,32);
est.agregarAuto(auto5,13);
est.agregarAuto(auto5,27);
est.mostrarEstacionamiento();

est.agregarPago(pago,5,fechaP);
est.agregarPago(pago1,12,fechaP1);
est.agregarPago(pago2,11,fechaP2);
est.agregarPago(pago3,21,fechaP3);
est.agregarPago(pago4,17,fechaP4);
est.agregarPago(pago5,32,fechaP5);
est.agregarPago(pago6,13,fechaP6);

System.out.println("---------------------");
est.mostrarEstacionamiento();
System.out.println("---------------------");
est.retirar(5);
est.retirar(12);
est.retirar(1);

}
}

