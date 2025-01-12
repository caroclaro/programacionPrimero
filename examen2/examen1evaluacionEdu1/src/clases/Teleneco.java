package clases;

import enums.Color;

public class Teleneco {

	private String apodo, nombreCompleto;
	private Color color;
	
	public Teleneco(String apodo, String nombreCompleto, Color color) {
		super();
		setApodo(apodo);
		setNombreCompleto(nombreCompleto);
		setColor(color);
	}

	private String getApodo() {
		return apodo;
	}

	private void setApodo(String apodo) {
		if(apodo==null) {
			throw new IllegalArgumentException("El apodo no puede ser nulo");
		}else if(apodo.isBlank()) {
			throw new IllegalArgumentException("El apodo no puede estar en blanco");
		}
		else {
		this.apodo = apodo;
		}
	}

	private String getNombreCompleto() {
		return nombreCompleto;
	}

	private void setNombreCompleto(String nombreCompleto) {
		if(nombreCompleto == null) {
			throw new IllegalArgumentException("Su nombre completo no puede ser null");
		} else if (nombreCompleto.isBlank()) {
			throw new IllegalArgumentException("Su nombre completo no puede estar en blanco");
		}
		else {
			this.nombreCompleto = nombreCompleto;
		}
	}

	private Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if(color == null) {
			throw new IllegalArgumentException("El color del teleñeco no debe ser nulo");
		}else {
			this.color = color;
		}
	}

	@Override
	public String toString() {
		return  nombreCompleto + " [" + color + "] ";
	}
	
	

}
