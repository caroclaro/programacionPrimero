package ejercicio2;

public class Main {

	public static void main(String []args) {
		String texto = "La magia y la fantasia son el sustento principal de la imaginacion de un ninio.";
		char letra = 'a';
		char car = '4';
		
		System.out.println(texto);
		System.out.println();
		
		int num = sustituirLetra(texto, letra, car);
		
		System.out.println("El número de veces que aparece la letra "+ letra + " es de "+ num);
	}
	
	public static int sustituirLetra (String texto, char letra, char car) {
		int numTotal=0;
		
		for (int i=0; i<texto.length(); i++) {
			if(texto.charAt(i)== letra) {
				numTotal++ ;
			}
		}
		
		texto = texto.replace(letra, car); //se cambian todas las letras que haya en la cadena por el caracter que le pases
		
		System.out.println(texto);
		System.out.println();
		return numTotal ;
	}
}
