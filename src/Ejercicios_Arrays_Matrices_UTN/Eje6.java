package Ejercicios_Arrays_Matrices_UTN;

import java.util.Scanner;

public class Eje6 {
	private static Scanner input = new Scanner(System.in);
	private static final int DEP_MAX = 5;

	public static void main(String[] args) {
		int i = 1;
		int cant = 0;
		int codDeporte;
		int nroSocio = 0;
		int[] dep = new int[DEP_MAX + 1];
		int maxEntero = Integer.MIN_VALUE;
		int depMax = 0;

		System.out.println("Ingrese Codigo Deporte: ");
		codDeporte = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese Codigo Socio: ");
		nroSocio = Integer.parseInt(input.nextLine());

		while (i <= DEP_MAX && nroSocio != 0) {

			dep[codDeporte]++;
			i++;
			System.out.println("Ingrese Codigo Deporte: ");
			codDeporte = Integer.parseInt(input.nextLine());

			System.out.println("Ingrese Codigo Socio: ");
			nroSocio = Integer.parseInt(input.nextLine());
		}

		System.out.println("Cantidad de Inscriptos por deporte");
		for (int l = 1; l <= DEP_MAX; l++) {
			for (int k = 1; k < dep.length; k++) {
				cant = dep[l];
			}
			System.out.println("Deporte " + l + " tiene " + cant + " inscriptos");
			cant = 0;
		}

		System.out.println("\nDeporte con la mayor cantidad de inscriptos");

		for (int m = 1; m <= DEP_MAX; m++) {
			if (dep[m] > maxEntero) {
				maxEntero = dep[m];
				depMax = m;
			}
		}
		System.out.println("Deporte: " + depMax);
	}

}
