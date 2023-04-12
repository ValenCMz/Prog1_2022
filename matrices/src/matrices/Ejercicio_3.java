package matrices;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_3 {
	static final int MAXFILA=5;
	static final int MAXCOL=10;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
	public static void main(String[] args) {
		int[][]mat = new int[MAXFILA][MAXCOL];
		cargar_matriz(mat);
		imprimir_matriz(mat);
		int posFila;
		int posCol;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingresar un valor entero");
			posFila = Integer.valueOf(entrada.readLine());
			System.out.println("Ingresar un valor entero");
			posCol = Integer.valueOf(entrada.readLine());
			if((posFila<MAXFILA)&&(posCol<MAXCOL)) {
				corrimiento_izq_fila_columna(mat[posFila],posCol);
				imprimir_matriz(mat);
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void corrimiento_izq_fila_columna(int[]arr, int pos) {
		int i = 0;
		while(i<pos) {
			arr[i] = arr[i+1];
			i++;
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
