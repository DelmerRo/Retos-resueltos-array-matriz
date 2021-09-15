package EstacionamientoMatrizClaseFecha;

public class Pago {
private double monto;
private String dniPersona;
public Pago(double monto, String dniPersona) {
	super();
	this.monto = monto;
	this.dniPersona = dniPersona;
}
private double getMonto() {
	return monto;
}
private void setMonto(double monto) {
	this.monto = monto;
}
private String getDniPersona() {
	return dniPersona;
}
private void setDniPersona(String dniPersona) {
	this.dniPersona = dniPersona;
}
@Override
public String toString() {
	return "Pago [monto=" + monto + ", dniPersona=" + dniPersona + "]";
}

}
