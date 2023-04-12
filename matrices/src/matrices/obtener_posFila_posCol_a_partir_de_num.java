package matrices;

//public class obtener_posFila_posCol_a_partir_de_num {

	/*	public static int MAXFILA = 4;
		public static int MAXCOLUMNA = 5;
		public static void main(String[] args) {
		int numero;
		int [][] matint;
		matint = new int [MAXFILA][MAXCOLUMNA];
		//cargar_matriz_aleatorio_int(matint);
		//imprimir_matriz_int(matint);
	//	BufferedReader entrada = new BufferedReader(new
		//InputStreamReader(System.in));
		try{
		System.out.println("ingrese un numero entero: ");
		//numero = Integer.valueOf(entrada.readLine());
		imprimir_fila_columna_matriz(matint, numero);
		}
		catch (Exception exc){
		System.out.println(exc);
		}
		}

	public static void imprimir_fila_columna_matriz(int[][] mat, int numero){
			int fila = 0;
			int columna = MAXCOLUMNA;
			while ((fila < MAXFILA) && (columna == MAXCOLUMNA)){
				columna = obtener_pos_arreglo(mat[fila],numero);
				if (columna == MAXCOLUMNA){
					fila++;
				}
			}
			if ((fila < MAXFILA) && (columna < MAXCOLUMNA)){
				System.out.println(numero+" se encuentra en "+fila+" y " + columna);
				}
				else {
					System.out.println(numero+" no se encuentra en la matriz");
				}
			}
			public static int obtener_pos_arreglo(int [] arr, int numero){
				int posicion = 0;
				while ((posicion < MAXCOLUMNA) && (arr[posicion] != numero)){
					posicion++;
				}
				return posicion;
				}
			}
*/
