package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_6 {
	static final int MAXFILA=5;
	static final int MAXCOL=10;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
	public static void main(String[] args) {
		int [][]mat = new int [MAXFILA][MAXCOL];
		int numero;
		cargar_matriz(mat);
		imprimir_matriz(mat);
		numero = obtener_numero_int();
		if((numero >=0)&&(numero<=9)){
			eliminar_toda_ocurrencia_num(mat,numero);
			imprimir_matriz(mat);
		}
		else {
			System.out.println(numero + " no esta en el rango");
		}
	} 
	
	public static void eliminar_toda_ocurrencia_num(int[][]mat, int num) {
		for(int fila = 0;fila<MAXFILA;fila++) {
			int col = obtener_pos_array(mat[fila], num);
			int i = 0;
			while((col<MAXCOL-1)&&(i<MAXCOL-1)) {
				corrimiento_izq(mat[fila],col);
				col = obtener_pos_array(mat[fila], num);
				i++;
			}
		}
	}
	public static void corrimiento_izq(int[]arr, int pos) {
		while(pos<MAXCOL-1) {
			arr[pos]=arr[pos+1];
			pos++;
		}
	}
	
	public static int obtener_pos_array(int[]arr, int num) {
		int pos = 0;
		while(pos<MAXCOL && (arr[pos]!=num)) {
			pos++;
		}
		return pos;
	}
	
	public static int obtener_numero_int() {
		int num=0;
		try {
			 BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return num;
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
