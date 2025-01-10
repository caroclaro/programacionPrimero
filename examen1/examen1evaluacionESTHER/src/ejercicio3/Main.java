package ejercicio3;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean seguir = true;
		int filas = 0;
		int columnas = 1;
		
		while(seguir == true) {
			
		System.out.println("Introduce el número de filas de la matriz");
		filas = sc.nextInt();
		if(filas == 0) {
			break;
		}
		System.out.println("Introduce el número de columnas de la matriz");
		columnas = sc.nextInt();
		
		if (filas != columnas) {
			System.out.println("La matriz debe de ser cuadrada");
		}else {
			char[][] m = crearMatrizAst(filas, columnas);
			mostrarMatrizAst(m);
		}
		}
	}
	
	public static char[][] crearMatrizAst(int filas, int columnas){
		char[][] m = new char[filas][columnas] ;
		return m;
		
	}

	public static void mostrarMatrizAst(char[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length;j++) {
				if(j==i) {
					System.out.print("X");
				}else {
					System.out.print("-");
				}
			}System.out.println();
		}
		
	}
}
