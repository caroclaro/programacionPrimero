package principal;

import clases.Persona;
import utility.Generador;

public class Principal {

	public static void main(String[] args) {
		Persona [][] parejas = new Persona[50][2];
		
		
		System.out.println("Creando las parejas . . .");
		
		int num1 =0;
		while (num1 < 50) {
            Persona[] p = Generador.generarPar();
            if (!parejaIsPresent(p, parejas)) {  // Solo insertar si la pareja no está presente
                for (int j = 0; j < parejas[num1].length; j++) {
                    parejas[num1][j] = p[j];
                }
                num1++;
            }
        }
		
		System.out.println();
		for(int i=0; i<parejas.length; i++) {
			System.out.print("Pareja " + (i+1) + ": ");;
			for(int j=0; j<parejas[i].length; j++) {
				System.out.print(parejas[i][j] + " ");
					if(j==0) {
						System.out.print(" AMA A  ");
					}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Buscando las que son de amor verdadero");
		int contador=0;
		for(int i=0; i<parejas.length; i++) {
			Persona p1 = parejas[i][0];
			Persona p2 = parejas[i][1];
			for(int j=0; j<parejas.length; j++) {
				if(parejas[j][0].equals(p2)) {
						if(parejas[j][1].equals(p1)) {
							contador++;
							break;
						}
				}
			}
		}
		
		Persona [][] enamorados = new Persona[contador++][2];
		
		
		boolean amor = false;
		contador = 0;
		for(int i=0; i<parejas.length; i++) {
			amor = false;
			Persona p1 = parejas[i][0];
			Persona p2 = parejas[i][1];
			
			for(int j=0; j<parejas.length; j++) {
				if(parejas[j][0].equals(p2)) {
						if(parejas[j][1].equals(p1)) {
							amor = true;
							enamorados[contador][0] = parejas[j][0];
							enamorados[contador][1] = parejas[j][1];
							contador++;
							break;
						}
				
				}
			}
		}
		
		
		System.out.println();
		for(int i=0; i<enamorados.length; i++) {
			System.out.print("enamorados " + (i+1) + ": ");;
			for(int j=0; j<enamorados[i].length; j++) {
				System.out.print(enamorados[i][j] + " ");
					if(j==0) {
						System.out.print("  ❤   ");
					}
			}
			System.out.println();
		}
		
		
		System.out.println();
		int total = Generador.numPersonas();
		System.out.println("De " + total +" se aman verdaderamente " + contador*2);

	}
	
	
	public static boolean parejaIsPresent(Persona[] p, Persona[][] parejas) {
		boolean existe = false;

        for (int i = 0; i < parejas.length; i++) {
            if (parejas[i][0] != null && parejas[i][1] != null) {
                Persona p1 = p[0];
                Persona p2 = p[1];

                if (parejas[i][0].equals(p1) && parejas[i][1].equals(p2)) {
                    existe = true;
                    break;
                }
            }
        }

        return existe;
    }
	}
