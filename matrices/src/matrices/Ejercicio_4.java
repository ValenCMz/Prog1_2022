package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_4 {
	static final int MAXFILA=5;
	static final int MAXCOL=10;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
	public static void main(String[] args) {
		int [][]mat = new int [MAXFILA][MAXCOL];
		int numero, fila,col;
		cargar_matriz(mat);
		imprimir_matriz(mat);
		try {
			 BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("Ingrese un valor tipo entero");
			 numero=Integer.valueOf(entrada.readLine());
			 System.out.println("Ingrese un valor tipo entero");
			 fila=Integer.valueOf(entrada.readLine());
			 System.out.println("Ingrese un valor tipo entero");
			 col=Integer.valueOf(entrada.readLine());
			 if((fila<MAXFILA)&&(col<MAXCOL)&&(numero>0)) {
				 insertar_num(mat,fila,col,numero);
				 imprimir_matriz(mat);
			 }
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void insertar_num(int[][]mat, int fila, int col, int num) {
		corrimiento_der_fila_columna(mat[fila], col);
		mat[fila][col] = num;
	}
	public static void corrimiento_der_fila_columna(int[]arr, int pos) {
		int i = MAXCOL-1;
		while(i>pos) {
			arr[i] = arr[i-1];
			i--;
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
