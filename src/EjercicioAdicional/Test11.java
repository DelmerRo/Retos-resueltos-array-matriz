package EjercicioAdicional;

public class Test11 {

	public static void main(String[] args) {
		String letra = "delmer";
		int cantLetras = letra.length();
		char[] c = new char[cantLetras];
		for (int posicion = 0; posicion < cantLetras; posicion++) {
			c[posicion] = letra.charAt(posicion);

		}

		System.out.println(c);

		int j = 0;
		char[] nuevaLista = new char[c.length];
		for (int i = 0; i < c.length; i++) {
			j = 0;
			boolean seEncontroIgual = false;
			while (j <= i && !seEncontroIgual) {
				seEncontroIgual = nuevaLista[j] == c[i];
				j++;
			}

			if (!seEncontroIgual) {
				nuevaLista[j - 1] = c[i];
				System.out.println(c[i]);
			}

		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			for(j=0;j<10;j++) {	
			System.out.print(j);
			}
		}
	}
}
