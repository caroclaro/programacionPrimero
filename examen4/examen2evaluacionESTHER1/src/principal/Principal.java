package principal;

import java.util.Scanner;

import aparcamiento.Aparcamiento;
import excepciones.ParkingException;
public class Principal {

	public static void main(String[] args) {
		Aparcamiento aparcamiento = new Aparcamiento();
		menu(aparcamiento);
	}

	public static void menu(Aparcamiento aparcamiento) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		while(num!=4) {
		System.out.println("Elija una opción ");
		System.out.println();
		System.out.println("1) Entrada de coche");
		System.out.println("2) Salida de coche");
		System.out.println("3) Mostrar situación del aparcamiento");
		System.out.println("4) Salir del programa");
		num = sc.nextInt();
		
		switch (num) {
		case 1: {
			try {
				aparcamiento.entradaCoche();
			} catch (ParkingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NumberFormatException e) {
				System.out.println("Este formato no es válido para las plazas");
			}
			break;
		}
		case 2:{
			try {
				aparcamiento.SalidaCoche();
			} catch (ParkingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NumberFormatException e) {
				System.out.println("Este formato no es válido para las plazas");
			}
			break;
		}
		case 3:{
					aparcamiento.mostrarPLazas();
					break;
				}
		case 4:{
					aparcamiento.terminar();
			System.out.println("Saliendo del programa");
			break;
		}
		default:
			//throw new IllegalArgumentException("Unexpected value: " + num);
			System.out.println("Opción inexistente");
			break;
		}
		System.out.println();
	}
}

}
