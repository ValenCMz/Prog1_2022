package matrices;

/*public class corrimiento_der_desde_num {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static void main(String[] args) {
	int [][] matint;
	int fila, columna;
	matint = new int[MAXFILA][MAXCOLUMNA];
	cargar_matriz_aleatorio_int(matint);
	imprimir_matriz_int(matint);
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	try{
		System.out.println("Ingrese una fila :");
		fila = Integer.valueOf(entrada.readLine());
		System.out.println("Ingrese una columna :");
		columna = Integer.valueOf(entrada.readLine());
		if ((0<=fila)&&(fila < MAXFILA)&&(0<=columna)&&(columna < MAXCOLUMNA)){
			corrimiento_der_fila_columna(matint[fila],columna);
			imprimir_matriz_int(matint);
	
		}
	}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void corrimiento_der_fila_columna(int [] arrenteros, int pos){
		int indice = MAXCOLUMNA-1;
		while (indice > pos){
			arrenteros[indice] = arrenteros[indice-1];
			indice--;
		}
	}
}
*/