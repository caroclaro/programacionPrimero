package clases;

import java.time.LocalDate;

public abstract class Electrodomestico {

	private double potencia; //potencia consumida por hora
	private LocalDate fechaCompra;
	
	public Electrodomestico(double potencia, LocalDate fechaCompra) {
		super();
		this.potencia = potencia;
		this.fechaCompra = fechaCompra;
	}

	public Electrodomestico(double potencia) {
		super();
		this.potencia = potencia;
		this.fechaCompra = LocalDate.now();
	}

	protected double getPotencia() {
		return potencia;
	}


	public LocalDate getFechaCompra() {
		return fechaCompra;
	}


	
	protected abstract double getConsumo(double numHoras); //Para que sea desarrollado en las hijas
	
	protected double getCosteConsumo(double numHoras , double costeHora) {
		return numHoras*costeHora;
	}

	@Override
	public String toString() {
		return "potencia=" + potencia + " ** fechaCompra=" + fechaCompra + " ** ";
	}
	
	
}
