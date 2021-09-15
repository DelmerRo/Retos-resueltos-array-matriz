package Ejercicios_Arrays_Matrices_UTN;

public class Eje5 {
	private static final int CANT_TIRADAS = 50;
	private static final int MAX_DADO = 7;
	private static final int MIN_DADO = 1;
	private static final int POSIBLES_RESULTADOS=12;
	public static void main(String[] args) {
		int j=0;
		int cant=0;
		int cantTiradas = CANT_TIRADAS;
		int[] dado1 = new int[cantTiradas];
		int[] dado2 = new int[cantTiradas];
		int[] resul = new int[cantTiradas];
		
		System.out.println("dado 1: ");
		for (int i = 0; i < cantTiradas; i++) {
			dado1[i] = (int) (Math.random() * (MAX_DADO - MIN_DADO) + MIN_DADO);
			System.out.print("[" + dado1[i] + "]");
		}
		
		System.out.println("dado 2: ");
		for (int i = 0; i < cantTiradas; i++) {
			dado2[i] = (int) (Math.random() * (MAX_DADO - MIN_DADO) + MIN_DADO);
			System.out.print("[" + dado2[i] + "]");
		}
		
		System.out.println("\nResultado de Tirada de dados: ");
		while(j<dado1.length && j<dado2.length) {
			resul[j]=dado1[j]+dado2[j];
			System.out.println("Resultado "+j+": "+dado1[j]+" + "+dado2[j]+" = "+resul[j]);
		j++;
		}
		
		System.out.println("veces por numero : ");
		for(int i=2;i<=POSIBLES_RESULTADOS;i++){
			for(int k=0;k<resul.length;k++) {
				if(i==resul[k]) {
					cant++;
				}
			}
			System.out.println(i+" salio "+cant+" veces");
			cant=0;
		}
	}

}
