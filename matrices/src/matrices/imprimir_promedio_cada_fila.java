package matrices;
import java.util.Random;
public class imprimir_promedio_cada_fila {
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
			System.out.println("Promedio de la fila "+fila+" es "+promedio_fila(mat,fila));
		}
	}
	public static int promedio_fila (int[][] mat, int fila){
		int promedio;
		int suma = 0;
		for (int columna = 0 ; columna < MAXCOLUMNA; columna++) {
			suma+=mat[fila][columna];
		}
		promedio = suma/MAXCOLUMNA;
		return promedio;
	}
}
