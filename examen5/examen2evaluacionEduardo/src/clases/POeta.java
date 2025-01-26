package clases;

import java.util.Objects;

public class Poeta {

	private static int contador=0;
	private int numero;
	private String nombre, ape1, pais;
	
	public Poeta(String nombre, String ape1, String pais) {
		super();
		this.numero = ++contador;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.pais = pais;
	}

	private void setNombre(String nombre) {
		if(nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser null");
		}else if((nombre.isBlank())||(nombre.isEmpty())) {
			throw new IllegalArgumentException("El nombre no puede estar en blanco");
		}else {
			this.nombre = nombre;
		}
	}

	private void setApe1(String ape1) {
		if(ape1 == null) {
			throw new IllegalArgumentException("El apellido no puede ser null");
		}else if((ape1.isBlank())||(ape1.isEmpty())) {
			throw new IllegalArgumentException("El apellido no puede estar en blanco");
		}else {
			this.ape1 = ape1;
		}
	}

	private void setPais(String pais) {
		if(pais == null) {
			throw new IllegalArgumentException("El pais no puede ser null");
		}else if((pais.isBlank())||(pais.isEmpty())) {
			throw new IllegalArgumentException("El pais no puede estar en blanco");
		}else {
			this.pais = ape1;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(ape1, nombre, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poeta other = (Poeta) obj;
		return Objects.equals(ape1, other.ape1) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pais, other.pais);
	}

	@Override
	public String toString() {
		return "[" + numero + "] " + nombre + ", " + ape1 + " (" + pais + ")";
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
