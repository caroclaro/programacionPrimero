package clases;

import java.time.LocalDate;

public class Frigorifico extends Electrodomestico {

	boolean modoVacaiones;

	public Frigorifico(double potencia, LocalDate fechaCompra, boolean modoVacaiones) {
		super(potencia, fechaCompra);
		this.modoVacaiones = modoVacaiones;
	}

	public Frigorifico(double potencia) {
		super(potencia);
		this.modoVacaiones = false;
	}

	@Override
	protected double getConsumo(double numHoras) {
		double consumo;
		if(modoVacaiones) {
			consumo = (getPotencia() * numHoras)*0.9;
		}else {
			consumo = (getPotencia() * numHoras);
		}
		
		return consumo;
	}

	@Override
	public String toString() {
	String vaciones;
	if(modoVacaiones) {
		vaciones= "Funcionando con agua caliente";
	}else {
		vaciones="Funcionando con agua fria";
	}
	return super.toString()+ vaciones + '\n' ;}
	
	
}
