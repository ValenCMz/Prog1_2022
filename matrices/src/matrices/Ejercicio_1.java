package matrices;
import java.util.Random;
public class Ejercicio_1 {
	static final int MAXFILA=5;
	static final int MAXCOL=10;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
	public static void main(String[] args) { 
		int[][]mat = new int[MAXFILA][MAXCOL];
		int fila = 0;
		cargar_matriz(mat);
		imprimir_matriz(mat);
		invertir_orden_por_fila(mat[fila]);
		System.out.println("-----------------------------------------------");
		imprimir_matriz(mat);

	}
	
	public static void invertir_orden_por_fila(int[]arr) {
		int aux = 0;
		for(int fila = 0;fila<MAXFILA;fila++) {
			for(int i=0;i<MAXCOL/2;i++) {
				aux = arr[i];
				arr[i] = arr[MAXCOL - 1 - i];
				arr[MAXCOL - 1 - i] = aux;
			}	
		}	
	}
	 public static void cargar_matriz (int [][] mat) {
	        Random r = new Random();
	        for (int fila = 0; fila < MAXFILA; fila++) {
	            cargar_arreglo(mat[fila]);
	        }
	    }
	  public static void imprimir_matriz(int [][] mat) {
	        for (int fila = 0; fila < MAXFILA; fila++) {
	            imprimir_arreglo(mat[fila]);
	        }
	    }
	   public static void cargar_arreglo(int [] arr) {
	        Random r = new Random();
	        for (int pos = 0; pos < MAXCOL; pos++) {
	            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
	        }
	    }
	   public static void imprimir_arreglo(int [] arr) {
	        for (int pos = 0; pos < MAXCOL; pos++) {
	            System.out.print("[" + arr[pos] + "]");
	        }
	        System.out.println("");
	    }
}
