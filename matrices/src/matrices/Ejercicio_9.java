package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_9 {
	static final int MAXFILA=4;
	static final int MAXCOL=5;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
	public static void main(String[] args) {
		int [][]mat = new int [MAXFILA][MAXCOL];
		int fila, col1,col2;
		cargar_matriz(mat);
		imprimir_matriz(mat);
		fila = obtener_numero_int();
		col1 = obtener_numero_int();
		col2 = obtener_numero_int();	
		ordenar_asc(mat[fila],col1,col2); 
		imprimir_matriz(mat);
	}
	public static void ordenar_asc(int[]arr,int col1, int col2) {
		int temp;
		for(int i = col1;i<col2;i++) {
			for(int j =col1;j<col2;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
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
