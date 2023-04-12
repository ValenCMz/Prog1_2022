package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_10 {
	static final int MAXFILA=4;
	static final int MAXCOL=20;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
    public static final double PROBABILIDAD = 0.4;
	public static void main(String[] args) {
		int [][]mat = new int [MAXFILA][MAXCOL];
		int fila, posIni,posFin,pos;
		cargar_matriz_secuencias_int(mat);
		imprimir_matriz_int(mat);
		fila = obtener_numero_int();
		pos= obtener_numero_int();
		posIni = obtener_pos_ini(mat[fila],pos);
		posFin = obtener_pos_fin(mat[fila],posIni);
		if((posIni<MAXCOL)&&(posFin<MAXCOL)) {
			System.out.println("Pos inicio: "+ posIni + " Pos fin: " + posFin);
		}
	}

	public static int obtener_pos_ini(int[]arr, int pos) {
		int i = pos;
		while((i<MAXCOL)&&(arr[pos]==0)) {
			pos++;
		}
			return pos;
	}
	
	public static int obtener_pos_fin(int[]arr, int pos) {
		int i = pos;
		while((i<MAXCOL)&&(arr[pos]!=0)) {
			pos++;
		}
			return pos-1;
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

    public static void cargar_matriz_secuencias_int(int [][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            cargar_arreglo_secuencias_int(mat[fila]);
        }
        System.out.println(" ");
    }

    public static void cargar_arreglo_secuencias_int(int [ ] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAXCOL - 1] = 0;
        for (int pos = 1; pos < MAXCOL - 1; pos++) {
            if (r.nextDouble() > PROBABILIDAD) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimir_matriz_int(int [][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            imprimir_arreglo_int(mat[fila]);
        }
    }

    public static void imprimir_arreglo_int(int [] arr) {
        for (int pos = 0; pos < MAXCOL; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
