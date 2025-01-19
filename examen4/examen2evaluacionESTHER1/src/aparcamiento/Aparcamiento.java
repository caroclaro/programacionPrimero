package aparcamiento;

import java.util.ArrayList;
import java.util.Scanner;

import conductor.Conductor;
import excepciones.ParkingException;

public class Aparcamiento {
	public static int plazas = 6;
	
	//Coche[] coche = new Coche[6]; TIene q ser arraylist
	ArrayList<Coche> coches= new ArrayList<>();
	ArrayList<Coche> salidas= new ArrayList<>();

	public Aparcamiento() {
		super();
		setCoches(coches);
		setSalidas(salidas);
	}

	private ArrayList<Coche> getCoches() {
		return coches;
	}

	private void setCoches(ArrayList<Coche> coches) {
		for(int i = 0; i<plazas; i++) {
			coches.add(null);
		}
		this.coches = coches;
	}

	private ArrayList<Coche> getSalidas() {
		return salidas;
	}

	private void setSalidas(ArrayList<Coche> salidas) {
		this.salidas = salidas;
	}
	
	public void entradaCoche() throws ParkingException {
		String matricula;
		int matriculaINT, plaza;
		String NIF;
		boolean socio=false;
		String socioRespuesta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido. ¿Cuál es el número de matricula de tu vehiculo?");
		matricula = sc.nextLine();
		if((matricula.length()<4)||(matricula.length()>4)) {
				throw new ParkingException("La matricula debe de tener 4 caracteres");}
		matriculaINT = Integer.parseInt(matricula);
		for(Coche coche:coches) {
			if((coche!=null)&&(coche.matricula == matriculaINT)) {
				throw new ParkingException("Ese vehiculo ya se encuentra en nuestro parking");
			}
			
		}
		
		System.out.println("¿Cuál es tu NIF?");
		NIF = sc.nextLine(); 
		
		System.out.println("¿Eres socio? (S/N)");
		socioRespuesta= sc.next();
		if(socioRespuesta.equals("S")) {
			socio = true;
		}
		
		Conductor conductor = new Conductor(NIF, socio);
		Coche coche = new Coche(conductor, matriculaINT);
		
		System.out.println("¿En que plaza de las "+ plazas + " totales desea aparcar su vehiculo?");
		plaza = sc.nextInt();
		
		if (plaza>plazas) {
			throw new ParkingException("No hay tantas plazas");
		}
		if(coches.get((plaza-1)) != null) {
			throw new ParkingException("La plaza está ocupada");
		}
		
		coches.set((plaza-1), coche);
		System.out.println("El coche con la matricula " + matriculaINT + " ha conseguido aparcar en la plaza "+ plaza);
		
	}
	
	public void SalidaCoche() throws ParkingException {
		int matricula;
		boolean comprobaciones = false;
		int plaza = -1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es la matricula del vehiculo que desea sacar?");
		matricula = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i) != null && coches.get(i).matricula == matricula) {
                comprobaciones = true;
                plaza = i;
                break; 
            }
        }
		
		if(!comprobaciones) {
			throw new ParkingException("Ese vehiculo no se encuentra en nuestras instalaciones");}
	
		Coche coche = coches.get(plaza);
		salidas.add(coche);
		
		coches.set(plaza, null);
		System.out.println("El coche con matricula " + matricula + " ha salido de la plaza " + (plaza+1));
		}
	
		public void mostrarPLazas() {
			System.out.println("Descripción de todas las plazas aparcamiento 'El parking'");
			System.out.println("-----------------------------------------------------------------------");
			for(int i=0; i<plazas; i++) {
				System.out.println();
				System.out.print("Plaza "+ (i+1));
				if(coches.get(i) == null) {
					System.out.print(":   (vacia)");
				}else {
					System.out.print(":   Matricula "+ coches.get(i).matricula + " NIF del conductor " + coches.get(i).conductor);
				}

			}
			System.out.println();
			System.out.println();
			System.out.println("-----------------------------------------------------------------------");
		}
	
		public void terminar() {
			if(salidas.size()>0) {
			System.out.println("Estos son los coches que han abandonado el aparcamiento: ");
			for (int i=0 ; i<salidas.size();i++) {
				System.out.println("   Matricula "+ salidas.get(i).matricula + " NIF del conductor " + salidas.get(i).conductor);
			}}
			else {
				System.out.println("Ningún coche abandonó el aparcamiento hasta ahora");
			}
		}
}
