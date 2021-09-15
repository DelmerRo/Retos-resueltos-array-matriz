package EjercicioAdicional;

public class Test13 {
	public static void main(String[] args) {
		String letra = "delmer";
		int cantLetras = letra.length();
		char[] c = new char[cantLetras];
		for (int posicion = 0; posicion < cantLetras; posicion++) {
			c[posicion] = letra.charAt(posicion);
		}
		System.out.println(c);

		char aux;
		for (int i = 0; i <= c.length / 2; i++) {
			aux = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = aux;
		}

		System.out.println(c);
	}
}
