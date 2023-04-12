package matrices;

import java.util.Random;

public class Ejercicio_2 {
	static final int MAXFILA=5;
	static final int MAXCOL=10;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
	public static void main(String[] args) {
		int[][]mat = new int[MAXFILA][MAXCOL];
		int cantidad = 0;
		cargar_matriz(mat);
		imprimir_matriz(mat);
		cantidad = obtener_pares_matriz(mat);
		System.out.println(cantidad);	
		 }
	
	
	public static int obtener_pares_matriz(int[][]mat) {
		int cant = 0;
		for(int fila = 0;fila<MAXFILA;fila++) {
			cant+=obtener_cant_pares_arr(mat[fila]);
		}
		return cant;
	}
	
	public static int obtener_cant_pares_arr(int[]arr) {
		int contador = 0;
		for(int i = 0;i<MAXCOL;i++) {
			if(arr[i]%2==0) {
				contador++;
				}
		}
		return contador;
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
