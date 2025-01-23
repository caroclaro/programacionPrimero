package clases;

public class AlumnoDistancia extends Alumno {

	private String usuario, clave;

	public AlumnoDistancia(String nombreCompleto, String dNI, String usuario, String clave) {
		super(nombreCompleto, dNI);
		this.usuario = usuario;
		this.clave = clave;
	}

	@Override
	public String toString() {
		int beca = valorBeca();
		return "Alumno a distancia " +  super.toString() + " usuario: " + usuario + ", clave: " + clave + " su beca es de " + beca + '\n';
	}

	@Override
	public int valorBeca() {
		//System.out.println(" la beca del alumno " + getNombreCompleto() + " es de 2000 euros");
		return 2000;
	}
	
	
	
}
