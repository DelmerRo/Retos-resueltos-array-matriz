package EjercicioAdicional;

public class Test14 {
	public static void main(String[] args) {
		String letra = "inminente";
		int cantLetras = letra.length();
		char[] c = new char[cantLetras];
		for (int posicion = 0; posicion < cantLetras; posicion++) {
			c[posicion] = letra.charAt(posicion);
		}
		System.out.println(c);
		char aux=0;
		int i=0;
		aux=c[i+1];
		for (int j = 0; j < c.length-1; j++) {
			  aux=c[1+i];
			  c[1+i]=c[0];
			  c[0]=aux;  
			}	
		}
	}
