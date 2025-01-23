package clases;

import enumerados.Porcentajes;
import excepciones.ExcepcionParcial;

public class AlumnoParcial extends Alumno {

	private Porcentajes porcentaje;
	int porcentajeNumerico;

	public AlumnoParcial(String nombreCompleto, String dNI, int porcentajeNumerico) throws ExcepcionParcial {
		super(nombreCompleto, dNI);
		setPorcentaje(porcentajeNumerico);
	}

	public Porcentajes getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) throws ExcepcionParcial {
		if(porcentaje == 30) {
			this.porcentaje = Porcentajes.TREINTA;
		} else if (porcentaje == 50) {
			this.porcentaje = Porcentajes.CINCUENTA;
		} else if (porcentaje == 70) {
			this.porcentaje = Porcentajes.SETENTA;
		} else {
			throw new ExcepcionParcial("El porcentaje no coincide con ninguno de los posibles");
		}
			
			
		
	}

	@Override
	public String toString() {
		
		String tiempoEstudio = "";
		if(Porcentajes.TREINTA == porcentaje) {
			tiempoEstudio = " estudia un 30% del tiempo ";
		} else if (Porcentajes.CINCUENTA == porcentaje) {
			tiempoEstudio = " estudia un 50% del tiempo ";
		} else if (Porcentajes.SETENTA == porcentaje) {
			tiempoEstudio = " estudia un 70% del tiempo ";}
		
		int beca = valorBeca();
		
		return "Alumno a tiempo parcial " + super.toString() + tiempoEstudio + " su beca es de " + beca  + '\n';
	}

	@Override
	public int valorBeca() {
		if(Porcentajes.TREINTA == porcentaje) {
			//System.out.println("La beca del alumno " + getNombreCompleto() + " es de 1000 euros");
			return 1000;
		} else if (Porcentajes.CINCUENTA == porcentaje) {
			//System.out.println("La beca del alumno " + getNombreCompleto() + " es de 1500 euros");
			return 1500;
		} else  {
			//System.out.println("La beca del alumno " + getNombreCompleto() + " es de 2000 euros");
			return 2000;}
		
	}
	
	
	
	
}
