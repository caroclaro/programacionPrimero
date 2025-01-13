package clases;

import java.util.Arrays;
import java.util.Iterator;

import enums.Ocupacion;

public class Aparcamiento {

	private int capacidad;
	private Ocupacion[] ocupacion;
	
	public Aparcamiento() {
		super();
	}

	public Aparcamiento(int capacidad) {
		super();
		setCapacidad(capacidad);
		setOcupacion(capacidad);
	}

	public int getCapacidad() {
		System.out.println("El aforo del aparcamiento es de " + capacidad);
		return capacidad;
	}

	private void setCapacidad(int capacidad) {
		if (capacidad <=0) {
			throw new IllegalArgumentException("El parking debe tener al menos una plaza");
		}else {
			this.capacidad = capacidad;
		}
	}

	private Ocupacion[] getOcupacion() {
		return ocupacion;
	}

	private void setOcupacion(int capacidad) {
		Ocupacion [] ocupacion = new Ocupacion[capacidad];
		for (int i=0; i<ocupacion.length; i++) {
			ocupacion[i]= Ocupacion.O;
		}
		this.ocupacion = ocupacion;
	}

	@Override
	public String toString() {
		return "Aparcamiento [capacidad=" + capacidad + ", ocupacion=" + Arrays.toString(ocupacion) + "]";
	}
	
	public void llenar() {
		for (int i=0; i<ocupacion.length; i++) {
				ocupacion[i]=Ocupacion.X;
		}
	}
	
	public void estaLleno() {
		boolean lleno=true;
		for (int i=0; i<ocupacion.length; i++) {
			if(ocupacion[i]==Ocupacion.O) {
				lleno=false;
			}
		}
		if(lleno) {
			System.out.println("El parking está lleno");
		}else {
			System.out.println("El parking no está lleno");
		}
	}
	
	public void vaciar() {
		for (int i=0; i<ocupacion.length; i++) {
				ocupacion[i]=Ocupacion.O;
			
		}
	}
	
	public void estaVacio() {
		boolean vacio=true;
		for (int i=0; i<ocupacion.length; i++) {
			if(ocupacion[i]==Ocupacion.X) {
				vacio=false;
			}
		}
		if(vacio) {
			System.out.println("El parking está vacio");
		}else {
			System.out.println("El parking no está vacio");
		}
	}
	
	public void aparcar(int plaza) {
		if(ocupacion[plaza]==Ocupacion.O) {
			System.out.println("Aparcando coche en la plaza " + plaza);
			ocupacion[plaza]=Ocupacion.X;
		}else {
			System.out.println("Lo sentimos, ya hay un coche en esa plaza");
		}
	}
	
	public void aparcar() {
		boolean yaAparco = false;
		while(!yaAparco) {
		int plaza = (int) (Math.random()*capacidad);
		if(ocupacion[plaza]==Ocupacion.O) {
			System.out.println("Aparcando coche en la plaza " + plaza);
			ocupacion[plaza]=Ocupacion.X;
			yaAparco=true;
		}
	}}
	
	public void desaparcar(int plaza) {
		if(ocupacion[plaza]==Ocupacion.X) {
			System.out.println("Sacando el coche de la plaza " + plaza);
			ocupacion[plaza]=Ocupacion.O;
		}else {
			System.out.println("Lo sentimos, no hay ningún vehiculo estacionado en esa plaza");
		}
	}
	
	public void plazasLibres() {
		String plazas = "";
		int num=0;
		for (int i=0; i<ocupacion.length; i++) {
			if(ocupacion[i]==Ocupacion.X) {
				plazas +=  i + " ";
				num++;
			}
		}
		System.out.println("hay un total de " + num + " plazas libres se encuentran en "+ plazas);
	}
	
}
