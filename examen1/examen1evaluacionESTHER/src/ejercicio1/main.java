package ejercicio1;

public class Main {

	public static void main(String[] args) {
		int [] arrayUno = crearArrayAleatorio();
		int [] arrayDos = crearArrayAleatorio();
		
		System.out.println("ARRAY 1");
		mostrarArray(arrayUno);
		
		System.out.println("ARRAY 2");
		mostrarArray(arrayDos);
		
		int [] arrayComunes = devolverComunes(arrayUno, arrayDos);
		
		if( arrayComunes.length == 0) {
			System.out.println("No hay ningún número igual");
		}else {
		System.out.println("Hay " + arrayComunes.length + " números iguales ");
		System.out.println();
		System.out.println("---Valores iguales---");
		mostrarArray(arrayComunes);}
	}
	
	public static int[] devolverComunes(int[] numeros1, int [] numeros2 ) {
		int contador=0;
		boolean comprobante=false;
				
		if(numeros1.length>numeros2.length) {
			for (int i = 0; i<numeros1.length; i++) {
				comprobante = incluido(numeros1[i], numeros2);
				if(comprobante==true) {
					contador++;
				}
			}
		}else {
			for (int j = 0; j<numeros2.length; j++) {
				comprobante = incluido(numeros2[j], numeros1);
				if(comprobante==true) {
					contador++;
				}
			}
		}
		
		int totalAprox = contador;
		
		int [] arrayRepetidos = new int[contador];
		contador=0;
		comprobante = false;
		
		if(numeros1.length>numeros2.length) {
			for (int i = 0; i<numeros1.length; i++) {
				comprobante = incluido(numeros1[i], numeros2);
				if(comprobante==true) {

					comprobante = incluido(numeros1[i], arrayRepetidos);
						if(comprobante==true) {
							totalAprox--;
						}else {
							arrayRepetidos[contador] = numeros1[i];
							contador++;}
				}
			}
		}else {
			for (int j = 0; j<numeros2.length; j++) {
				comprobante = incluido(numeros2[j], numeros1);
				if(comprobante==true) {
					comprobante = incluido(numeros2[j], arrayRepetidos);
					if(comprobante==true) {
						totalAprox--;
					}else {
						arrayRepetidos[contador] = numeros2[j];
						contador++;}
				}
			}
		}
		
		int [] arrayRepetidosVERDADERO = new int[totalAprox];
		
		for(int i= 0; i<arrayRepetidosVERDADERO.length; i++) {
				arrayRepetidosVERDADERO[i]=  arrayRepetidos[i];
		}
		
		return arrayRepetidosVERDADERO; 
	}
	
	
	public static boolean incluido(int num, int [] numeros) {
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public static int[]crearArrayAleatorio(){
		int tamanio = (int) ((Math.random()*10)+1);
		int [] arrayNuevo = new int[tamanio];
		for(int i=0; i<arrayNuevo.length; i++) {
			int numAleatorio = (int) ((Math.random()*20)+1);
			arrayNuevo[i] = numAleatorio;
		}
		return arrayNuevo; // cree un array con valores aleatorios entre 1 y 20 y lo devuelva al códigollamante. El tamaño del array creado es también un valor aleatorio entre 1 y 10
	}
	
	public static void mostrarArray(int[] numeros) {
		for(int i=0; i<numeros.length; i++) {
			System.out.print("  " + numeros[i] + "  ");
		}
		System.out.println();
		System.out.println();
	}  
}
