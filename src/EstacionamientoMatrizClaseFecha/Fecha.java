package EstacionamientoMatrizClaseFecha;

import java.util.Calendar;
public  class Fecha {
private int dia;
private int mes;
private int año;
public Fecha(int dia, int mes, int año) {
	super();
	this.dia = dia;
	this.mes = mes;
	this.año = año;
}
@Override
public String toString() {
	return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
}
private int getDia() {
	return dia;
}
private void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
private void setMes(int mes) {
	this.mes = mes;
}
private int getAño() {
	return año;
}
private void setAño(int año) {
	this.año = año;
}

public static Fecha  hoy() {
	int dia = 0;
	int mes = 0;
	int año = 0;
	Fecha hoy;
	dia = (Calendar.DATE);
	mes = (Calendar.MONTH);
	año = (Calendar.YEAR);
	hoy=new Fecha(dia,mes,año);
	return hoy;	
}
}
