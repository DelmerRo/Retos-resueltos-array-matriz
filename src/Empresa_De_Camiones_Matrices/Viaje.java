package Empresa_De_Camiones_Matrices;

public class Viaje {
	private double kmsDelViaje;
	private int idCamion;
	private String idChofer;

	public Viaje(double kmsDelViaje, int idCamion, String idChofer) {
		super();
		this.kmsDelViaje = kmsDelViaje;
		this.idCamion = idCamion;
		this.idChofer = idChofer;
	}

	public double getKmsDelViaje() {
		return kmsDelViaje;
	}

	public int getIdCamion() {
		return idCamion;
	}

	public String getIdChofer() {
		return idChofer;
	}

	@Override
	public String toString() {
		return "Viaje [kmsDelViaje=" + kmsDelViaje + ", idCamion=" + idCamion + "]";
	}
}
