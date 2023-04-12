package matrices;
import java.util.Random;

public class Recuperatorio_1 {
	public static final int MAXFILA = 2;
    public static final int MAXCOLUMNA = 10;
    public static final double PROBABILIDAD = 0.4;
	public static void main(String[] args) {
		char[][]mat = new char [MAXFILA][MAXCOLUMNA];
		cargar_matriz_secuencias_char(mat);
		imprimir_matriz_char(mat);
		insertar_ultimo_caracter_vocal_por_sec_mat(mat);
	}
	
	public static void insertar_ultimo_caracter_vocal_por_sec_mat(char[][]mat) {
		for(int fila = 0; fila<MAXFILA;fila++) {
			insertar_ultimo_caracter_vocal_por_sec_arr(mat[fila]);
		}
	}
	
	public static void insertar_ultimo_caracter_vocal_por_sec_arr(char[]arr) {
		int inicio = 0;
		int fin = -1;
		while(inicio<MAXCOLUMNA-1) {
			inicio = obtener_inicio(arr, fin+1);
			fin = obtener_fin(arr,inicio);	
			System.out.println(inicio + "  "+  fin);
			inicio = obtener_inicio(arr, fin+1);
		}
			//if(contiene_vocales(arr,inicio,fin)) {
				
			//}
		}
	
	/*public static boolean contiene_vocales(char[]arr, int inicio, int fin) {
		int cont = 0;
		for(int i = inicio; i<=fin;i++) {
			if(arr[i]=='a') {
				cont++;
				if(cont==1) {
					if(arr[i]=='e') {
						cont++;
						if(cont==2) {
							
						}
					}
				}
			}
			
			if(arr[i]=='i') {
				true;
			}
			if(arr[i]=='o') {
				true;
			}
			if(arr[i]=='u') {
				true;
			}
		}
	}*/
	
	public static int obtener_inicio(char[]arr, int pos) {
		while((pos<MAXCOLUMNA)&&(arr[pos]==' ')){
			pos++;
		}
		return pos;
	}
	
	public static int obtener_fin(char[]arr, int pos) {
		while((pos<MAXCOLUMNA)&&(arr[pos]!=' ')){
			pos++;
		}
		return pos - 1 ;
	}
	
	
	public static void cargar_matriz_secuencias_char(char [][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            cargar_arreglo_secuencias_char(mat[fila]);
        }
        System.out.println(" ");
    }

    public static void cargar_arreglo_secuencias_char(char [ ] arr) {
        Random r = new Random();
        arr[0] = ' ';
        arr[MAXCOLUMNA - 1] = ' ';
        for (int pos = 1; pos < MAXCOLUMNA - 1; pos++) {
            if (r.nextDouble() > PROBABILIDAD) {
                arr[pos] = (char) (r.nextInt(26) + 'a');
            } else {
                arr[pos] = ' ';
            }
        }
    }

    public static void imprimir_matriz_char(char [][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            imprimir_arreglo_char(mat[fila]);
        }
    }

    public static void imprimir_arreglo_char(char [] arr) {
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
