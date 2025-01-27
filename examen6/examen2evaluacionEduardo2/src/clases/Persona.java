package clases;

import java.util.Objects;

import javax.management.RuntimeErrorException;

public class Persona {

	private String apodo;

	public Persona(String apodo) {
		super();
		setApodo(apodo);
	}

	private String getApodo() {
		return apodo;
	}

	private void setApodo(String apodo) {
		if(apodo==null) {
			throw new IllegalArgumentException("El apodo no puede ser nulo");
		}else if((apodo.isBlank())||(apodo.isEmpty())){
			throw new IllegalArgumentException("El apodo no puede estar vacio");
		}
		else if(apodo.length()<2) {
			throw new IllegalArgumentException("El apodo es demasiado corto, debe tener dos caracteres al menos");
		}else {
			this.apodo = apodo;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(apodo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apodo, other.apodo);
	}

	@Override
	public String toString() {
		return apodo;
	}
	
	
	
}
