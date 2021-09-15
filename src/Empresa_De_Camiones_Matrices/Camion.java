package Empresa_De_Camiones_Matrices;

public class Camion {
	private int idCamion;
	private double costoPorKm;

	public Camion(int idCamion, double costoPorKm) {
		super();
		this.idCamion = idCamion;
		this.costoPorKm = costoPorKm;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	@Override
	public String toString() {
		return "Camion [idCamion=" + idCamion + ", costoPorKm=" + costoPorKm + "]";
	}
}
