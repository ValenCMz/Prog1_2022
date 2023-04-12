package matrices;

public class imprimir_promedio_por_columna {

	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static void main(String[] args) {
	int [][] matint;
	matint = new int [MAXFILA][MAXCOLUMNA];
	//cargar_matriz_aleatorio_int(matint);
	//imprimir_matriz_int(matint);
	imprimir_por_pantalla_promedios_matriz(matint);
	}
		public static void imprimir_por_pantalla_promedios_matriz(int [][] mat){
			int promedio;
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				promedio = obtener_promedio_columna(mat,columna);
				System.out.println("el promedio de la columna "+columna+" es "+promedio);
			}
		}
		public static int obtener_promedio_columna(int [][] mat, int columna){
			int promedio,suma;
			suma = 0;
			for (int fila = 0; fila < MAXFILA; fila++){
					suma+=mat[fila][columna];
		}
			promedio=suma/MAXFILA;
			return promedio;
		}

}
