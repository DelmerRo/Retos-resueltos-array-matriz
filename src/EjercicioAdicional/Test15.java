package EjercicioAdicional;

import java.util.Arrays;

public class Test15 {
	public static void main(String[] args) {
		String letra = "mama";
		int cantLetras = letra.length();
		char[] c = new char[cantLetras];
		for (int posicion = 0; posicion < cantLetras; posicion++) {
			c[posicion] = letra.charAt(posicion);
		}
		System.out.println(c);

		String letra1 = "salmon";
		int cantLetras1 = letra1.length();
		char[] c1 = new char[cantLetras1];
		for (int posicion = 0; posicion < cantLetras1; posicion++) {
			c1[posicion] = letra1.charAt(posicion);
		}
		System.out.println(c1);

		
		char[] resultado = new char[c.length + c1.length];
		for (int i = 0; i < resultado.length; i++) {
			int a=0;
			boolean seAgrego = false;
			while(a<c.length && !seAgrego)  {
				if (resultado[a] != c[i]) {
					resultado[i] = c[i];
					seAgrego=true;
					a=0;
				}else {
					a++;
				}
			}
		
		}
		/*for (int j = 0; !seAgrego; j++) {
			if (resultado[j] != c1[j]) {
				resultado[j + 1] = c1[j];
				seAgrego = true;
				j++;
			}

		}*/
		System.out.println(Arrays.toString(resultado));
	}
}
