package utility;

import clases.Persona;

public class Generador {

	public Generador() {
		super();
	}
	
	private static Persona[]personas = {new Persona("REYES"),new Persona("IMANE"),
			new Persona("ALEX"),new Persona("CAMILO"),new Persona("VIOLETA"),
			new Persona("VICTOR"),new Persona("MATEO"), new Persona("JUAN"),
			new Persona("TASMINE"),new Persona("CIARA"),new Persona("DAVID"),
			new Persona("IVAN"),new Persona("ENZO"),new Persona("JAVIER"),
			new Persona("DYLAN"), new Persona("ADRIAN"), new Persona("ADRIANA"),
			new Persona("MARTIN"), new Persona("RAYO"), new Persona("MARIO"),
			new Persona("SEBAS"), new Persona("IDRIS"), new Persona("JULIO")};
	
	public static Persona generarPersona() {
		int i = personas.length;
		//  Math. random() * (max - min) + min
		int numAleatorio= (int) (Math.random()*i);
		return personas[numAleatorio];
	}
	
	public static Persona[] generarPar() {
		Persona p1 = generarPersona();
		Persona p2 = generarPersona();
		
		while(true) {
		if(p1.equals(p2)) {
			p2 = generarPersona();
		}else{
			break;}
		}
		
		Persona[] pareja = {p1, p2};
		return pareja;
	}
	
	public static int numPersonas()
	{
		return personas.length;
	}
}
