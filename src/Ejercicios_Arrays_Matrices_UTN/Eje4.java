package Ejercicios_Arrays_Matrices_UTN;

public class Eje4 {
	public static void main(String[] args) {
		int tamañoVector = 25;
		int tamañoVectorN = 50;

		int[] vectorA = new int[tamañoVector];
		int[] vectorB = new int[tamañoVector];
		int[] vectorC = new int[tamañoVectorN];
		int[] vectorD = new int[tamañoVector];

		System.out.println("Vector A: ");
		for (int i = 0; i < tamañoVector; i++) {
			vectorA[i] = (int) (Math.random() * (tamañoVector - 0) + 0);
			System.out.print("[" + vectorA[i] + "]");
		}

		System.out.println("\nVector B: ");
		for (int i = 0; i < tamañoVector; i++) {
			vectorB[i] = (int) (Math.random() * ((tamañoVector - 1) - 1) + 1);
			System.out.print("[" + vectorB[i] + "]");
		}
		/*
		 * a) genere e informe un tercer vector C intercalando los valores de posición
		 * impar de A y los valores de posición par de B.
		 */
		System.out.println("\nVector C");
		int i = 0;
		int j = 0;
		while (i < vectorA.length && i < vectorB.length) {
			if (vectorA[i] % 2 != 0) {
				vectorC[j] = vectorA[i];
				System.out.print("[A" + vectorC[j] + "]");
				j++;
			}
			if (vectorB[i] % 2 == 0) {
				vectorC[j] = vectorB[i];
				System.out.print("[B" + vectorC[j] + "]");
				j++;
			}
			i++;
		}
		System.out.println("\n cantidad vector N: " + j);

		/*
		 * b) genere e informe un tercer vector D donde cada elemento contenga un valor
		 * cero si los elementos de una misma posición de A y B son iguales, o un valor
		 * uno si no lo son.
		 */
		System.out.println("\n Iguales=0, distintos=1");
		int k = 0;
		while (k < vectorA.length && k < vectorB.length) {
			if (vectorA[k] == vectorB[k]) {
				vectorD[k] = 0;
				System.out.print("[" + vectorD[k] + "]");
			} else {
				vectorD[k] = 1;
				System.out.print("[" + vectorD[k] + "]");
			}
			k++;
		}

	}
}
