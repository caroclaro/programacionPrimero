package clases;

import java.util.Objects;

public class Estudiante {
	
	private String apodo;

	public Estudiante(String apodo) {
		setApodo(apodo);
	}

	public String getApodo() {
		return apodo;
	}

	private void setApodo(String apodo) {
		if(apodo == null) {
			throw new IllegalArgumentException("El apodo no puede ser null");
		}else if((apodo.isBlank())||(apodo.isEmpty())) {
			throw new IllegalArgumentException("El apodo no puede estar en blanco");
		}
		else if(apodo.length()<3) {
			  throw new IllegalArgumentException("El apodo debe de tener una longitud de al menos tres caracteres");
		}else {
			this.apodo=apodo;
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
		Estudiante other = (Estudiante) obj;
		return Objects.equals(apodo, other.apodo);
	}

	@Override
	public String toString() {
		return apodo ;
	}
	
	
	

}
