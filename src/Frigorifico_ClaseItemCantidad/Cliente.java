package Frigorifico_ClaseItemCantidad;

public class Cliente {
	private String razonSocial;
	private int CUITCliente;
	private int telefono;
	private Pais pais;

	public Cliente(String razonSocial, int cUITCliente, int telefono, Pais pais) {
		super();
		this.razonSocial = razonSocial;
		CUITCliente = cUITCliente;
		this.telefono = telefono;
		this.pais = pais;
	}

	public int getCUITCliente() {
		return CUITCliente;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String toString() {
		return "\nCliente [razonSocial=" + razonSocial + ", CUITCliente=" + CUITCliente + ", telefono=" + telefono
				+ ", pais=" + pais + "]";
	}

	public int obtenerPosicionPais() {
		return pais.ordinal();
	}
}
