package clases;

public class AlumnoTiempoTotal extends Alumno{

	public AlumnoTiempoTotal(String nombreCompleto, String dNI) {
		super(nombreCompleto, dNI);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		int beca = valorBeca();
		return "Alumno de tiempo total " + super.toString() + " su beca es de " + beca + '\n';
	}

	@Override
	public int valorBeca() {
		//System.out.println("La beca del alumno " + getNombreCompleto() + " es de 3000 euros");
		return 3000;
	}

	
}
