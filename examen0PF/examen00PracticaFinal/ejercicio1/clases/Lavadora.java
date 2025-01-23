package clases;

import java.time.LocalDate;

public class Lavadora extends Electrodomestico {
	boolean aguaCaliente;

	public Lavadora(double potencia, LocalDate fechaCompra, boolean aguaCaliente) {
		super(potencia, fechaCompra);
		this.aguaCaliente = aguaCaliente;
	}



	public Lavadora(double potencia) {
		super(potencia);
		this.aguaCaliente = true;
	}

	

	@Override
	protected double getConsumo(double numHoras) {
		double consumo;
		if(aguaCaliente) {
			consumo = (getPotencia() * numHoras)*1.2;
		}else {
			consumo = (getPotencia() * numHoras);
		}
		
		return consumo;
	}



	@Override
	public String toString() {
		String agua;
		if(aguaCaliente) {
			agua= "Funcionando con agua caliente";
		}else {
			agua="Funcionando con agua fria";
		}
		return super.toString()+ agua + '\n' ;
	}


	
}
