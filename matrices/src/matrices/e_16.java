package matrices;

/*en cada fila, si se verifica que la secuencia de mayor tamaño de la fila para MAT1 es
 mayor que la primer secuencia en dicha fila para MAT2, las intercambie (la que está
 en MAT1 pasa a MAT2 y la que esta en MAT2 pasa a MAT1) sin usar estructuras
 auxiliares (otros arreglos o matrices).*/
public class e_16 {
	public static final char MAXFILA = 3;
	public static final char MAXCOLUMNA = 8;
	public static final char MAX = 8;

	public static void main(String[] args) {
		char[][] MAT1 = { { ' ', 'A', ' ', 'O', 'y', 'C', ' ', ' ' },
						{ ' ', ' ', ' ', 'i', 'A', 'p', ' ', ' ' },
						{ ' ', ' ', ' ', '8', 'A', 'u', ' ', ' ' }, };
		
		char[][] MAT2 = { { ' ', ' ', '1', 'i', 'p', ' ', ' ', ' ' },
						{ ' ', 'b', ' ', 'i', 'g', ' ', 'A', ' ' },
						{ ' ', 'c', ' ', ' ', 'A', ' ', 'A', ' ' }, };
		System.out.println("Matriz 1");
		imprimir_matriz_char(MAT1);
		System.out.println("Matriz 2");
		imprimir_matriz_char(MAT2);
		hacerlugar_intercambiar(MAT1, MAT2);
		System.out.println("Matriz 1");
		imprimir_matriz_char(MAT1);
		System.out.println("Matriz 2");
		imprimir_matriz_char(MAT2);
	}
	//En cada fila, si la sec mayor tam de mat1 es > que la primer sec en mat2, las intercambio
	public static void hacerlugar_intercambiar(char[][] mat1, char[][] mat2) {
			int inicio=0;
			int fin = 0;
			int tamanio1=0;
			int tamanio2=0;
			for(int fila=0;fila<MAXFILA;fila++) {
				int inicio2 = 0;
				int fin2 = 0;
				inicio = obtener_ini_sec_mayortamanio(/*aca deberia recibir el mat[fila]*/); 
				fin = obtener_fin_secuencia(mat1[fila], inicio);
				tamanio1 = fin - inicio + 1;
				inicio2 = obtener_inicio_secuencia(mat2[fila],fin2);
				fin2 = obtener_fin_secuencia(mat2[fila],inicio2);
				tamanio2 = fin2-inicio2+1;
				if(tamanio1>tamanio2) {
					//Hay que tener en cuenta que el tamanio 1 es mas grande que el tamanio 2 a la hora de intercambiar
					crear_espacios(mat2[fila], fin2, tamanio1, tamanio2);
					intercambiar_sec(mat1[fila],mat2[fila], inicio, fin, inicio2, fin2);
					eliminar_espacios(mat1[fila], inicio, tamanio1,tamanio2);
				}
				System.out.println(fila + " " + inicio2 + " " + fin2);
			}
		}
	
	public static void intercambiar_sec(char[]arr1, char[]arr2, int inicio, int fin, int inicio2, int fin2) {
		char aux = ' ';
		while(inicio<=fin){
			aux = 	arr1[inicio] ;
			arr1[inicio] = arr2[inicio2];
			arr2[inicio2] = aux;
			inicio++;
			inicio2++;
		}
	}
	 	
	public static void eliminar_espacios(char[]arr, int inicio, int tamanio1, int tamanio2) {
		int diferencia = tamanio1-tamanio2;
		for(int i=0; i<diferencia;i++) {
			corrimiento_izq(arr, inicio);
		}
	}
	
	public static void crear_espacios(char[]arr, int fin2, int tamanio1, int tamanio2) {
		int diferencia = tamanio1 - tamanio2;
		for(int i=0; i<diferencia; i++) {
			corrimiento_der(arr, fin2);
		}
	}
	
	public static void corrimiento_izq(char[] arr, int inicio) {
		int indice = inicio;
		while (indice < MAXCOLUMNA - 1) {
			arr[indice] = arr[indice + 1];
			indice++;
		}
	}

	public static void corrimiento_der(char[] arrenteros, int pos) {
		int indice = MAXCOLUMNA - 1;
		while (indice > pos) {
			arrenteros[indice] = arrenteros[indice - 1];
			indice--;
		}
	}

	public static int obtener_ini_sec_mayortamanio() {
		return 3;
	}// pasar el arreglo2 como parametro

	public static int obtener_inicio_secuencia(char[] arr, int inicio) {
		while ((inicio < MAXCOLUMNA) && (arr[inicio] == ' '))
			inicio++;
		return inicio;
	}

	public static int obtener_fin_secuencia(char[] arr, int inicio) {
		while ((inicio < MAXCOLUMNA) && (arr[inicio] != ' '))
			inicio++;
		return inicio - 1;
	}

	public static void imprimir_matriz_char(char[][] mat) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++) {
				System.out.print(mat[fila][columna] + "|");
			}
			System.out.println("");
		}
	}
}