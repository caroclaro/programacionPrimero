package main;

import clases.Emision;
import clases.Teleneco;
import enums.Color;
import enums.DiaSemana;

public class Main {

	public static void main(String[] args) {
		Teleneco t1 = new Teleneco("ANIMAL", "ANIMAL", Color.ROJO);
		Teleneco t2 = new Teleneco("FOZZIE", "FOZZIE EL OSO ", Color.NARANJA);
		Teleneco t3 = new Teleneco("GONZO", "GONZO EL GRANDE", Color.AZUL);
		Teleneco t4 = new Teleneco("GUSTAVO", "LA RANA GUSTAVO", Color.VERDE);
		Teleneco t5 = new Teleneco("PEGGY", "SEÑORITA PEGGY ", Color.ROSA);
		Teleneco t6 = new Teleneco("ROWLF", "ROWLF EL PERRO ", Color.MARRON);
		
		System.out.println(t1 +""+ t2 +""+ t3 +""+ t4 +""+ t5 +""+ t6);
		
		Emision e1 = new Emision(DiaSemana.LUNES);
		System.out.println(e1);
		
		//haria un metodo para agregarlos aleatoriamente con math random y un switch pero no voy a perder mas el tiempo
		Emision e2 = new Emision(DiaSemana.LUNES, t1);
		e2.agregar(t6);
		e2.hayTeleneco(t2);
		e2.agregar(t2);
		System.out.println(e2);
		
		Emision e3 = new Emision(DiaSemana.MARTES, t1);
		e3.agregar(t5);
		e3.agregar(t4);
		e3.agregar(t2);
		System.out.println(e3);
	}
}
