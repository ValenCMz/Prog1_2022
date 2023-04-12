package matrices;
import java.util.Random;
public class imprimir_promedio_cada_fila_con_arrays {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
	int [][] matint;
	matint = new int[MAXFILA][MAXCOLUMNA];
	//cargar_matriz_aleatorio_int(matint);
	//imprimir_matriz_int(matint);
	imprimir_promedios_filas(matint);
	}
	public static void imprimir_promedios_filas (int[][] mat){
		for (int fila = 0 ; fila < MAXFILA; fila++){
			//mat[fila] es un arreglo de enteros de tamano MAXCOLUMNA
			//en la declaración de promedio_arreglo, la variable parametro arr puede acceder a los mismos valores que mat[fila]
			System.out.println("Promedio de la fila "+fila+" es "+promedio_arreglo(mat[fila]));
		}
	}
	public static int promedio_arreglo (int[] arr){
		int promedio;
		int suma = 0;
		for (int pos = 0 ; pos < MAXCOLUMNA; pos++) {
			suma+=arr[pos];
		}
		promedio = suma/MAXCOLUMNA;
		return promedio;
	}
}
