package aparcamiento;

import conductor.Conductor;
import excepciones.ParkingException;

public class Coche {

	Conductor conductor;
	int matricula;
	
	public Coche(Conductor conductor, int matricula) {
		super();
		this.conductor = conductor;
		this.matricula = matricula;
	}

	private Conductor getConductor() {
		return conductor;
	}

	private void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	private int getMatricula() {
		return matricula;
	}

	private void setMatricula(int matricula)  {
		// if((matricula > 9999)||(1000>matricula)) {
		//throw new ParkingException("La matricula debe de tener 4 caracteres");
			this.matricula = matricula;

	}
	
	
}
