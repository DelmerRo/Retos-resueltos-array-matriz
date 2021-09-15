package EjercicioAdicional;

public class Test12 {
	public static void main(String[] args) {
		String letra = "lkjtjkl";
		int cantLetras = letra.length();
		char[] c = new char[cantLetras];
		for (int posicion = 0; posicion < cantLetras; posicion++) {
			c[posicion] = letra.charAt(posicion);
		}

		System.out.println(c);
		int cant = 0;
		boolean esPalindromo = false;
		for (int i = 0; i < cantLetras / 2; i++) {
			if (c[i] == c[((cantLetras-i)-1)]) {
				cant++;
				esPalindromo = cant == cantLetras / 2;
			}
		}
		System.out.println(esPalindromo);
	}	
}
