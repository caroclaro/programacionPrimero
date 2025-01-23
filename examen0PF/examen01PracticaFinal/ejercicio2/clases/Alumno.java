package clases;

import interfaces.Becable;

public abstract class Alumno implements Becable {

	private String nombreCompleto, DNI;

	public Alumno(String nombreCompleto, String dNI) {
		super();
		this.nombreCompleto = nombreCompleto;
		DNI = dNI;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public String getDNI() {
		return DNI;
	}


	@Override
	public String toString() {
		return " nombre: " + nombreCompleto + ", DNI:" + DNI ;
	}
	
	
	
}
