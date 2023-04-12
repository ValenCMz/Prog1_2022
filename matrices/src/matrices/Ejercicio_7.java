package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_7 {
	static final int MAXFILA=4;
	static final int MAXCOL=5;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
	public static void main(String[] args) {
		int [][]mat = new int [MAXFILA][MAXCOL]; 
		int num, fila;
		cargar_matriz(mat);
		imprimir_matriz(mat);
		num = obtener_numero_int();
		fila = obtener_numero_int();
		insertar_manteniendo_orden(mat[fila],num);
		imprimir_matriz(mat);
	}
	
	public static void insertar_manteniendo_orden(int[]arr, int num) {
		int pos = 0;
		pos=obtener_pos_ordenado(arr,num);
		if(pos<MAXCOL) {
			corrimiento_der(arr,pos);
			arr[pos]=num;
		}
	}
	public static void corrimiento_der(int[]arr, int pos){
		int i = MAXCOL-1;
		while(i>pos) {
			arr[i] = arr[i-1];
			i--;
		}
	}
	public static int obtener_pos_ordenado(int []arr, int num) {
		int pos=0;
		while((pos<MAXCOL)&&(arr[pos]<num)) {
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
        ordenar_filas(mat);
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
   public static void ordenar_filas(int [ ][ ] mat) {
       for (int fila = 0; fila < MAXFILA; fila++) {
           ordenar_arreglo_seleccion(mat[fila]);
       }
   }

   public static void ordenar_arreglo_seleccion(int [ ] arr) {
       int posMenor, temp;
       for (int i = 0; i < MAXCOL; i++) {
           posMenor = i;
           for (int j = i + 1; j < MAXCOL; j++) {
               if (arr[j] < arr[posMenor]) {
                   posMenor = j;
               }
           }
           if (posMenor != i) {
               temp = arr[i];
               arr[i] = arr[posMenor];
               arr[posMenor] = temp;
           }
       }
   }
}
