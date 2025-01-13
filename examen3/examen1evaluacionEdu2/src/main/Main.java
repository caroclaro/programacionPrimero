package main;

import clases.Aparcamiento;

public class Main {
	
	public static void main(String args[]) {
		Aparcamiento p1 = new Aparcamiento(5);
		Aparcamiento p2 = new Aparcamiento(10);
		Aparcamiento p3 = new Aparcamiento(3);
		
		p1.llenar();
		p2.llenar();
		p3.llenar();
		
		p1.estaLleno();
		p2.estaLleno();
		p3.estaLleno();
		
		p1.vaciar();
		p1.estaVacio();
		
		int numAleatorio= (int) ((Math.random()*3)+1);
		for(int i=0; i<numAleatorio; i++) {
			p1.aparcar();
		}
		
		p3.getCapacidad();
	}

}
