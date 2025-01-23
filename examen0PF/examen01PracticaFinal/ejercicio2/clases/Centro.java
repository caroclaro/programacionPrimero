package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Centro {

	private ArrayList<Alumno> alumnos ;
	private String nombreCentro;
	
	public Centro( String nombreCentro) {
		super();
		this.nombreCentro = nombreCentro;
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public void nuevoAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public void compareTo() {
		System.out.println("Ordenando alumnos . . . ");
		Collections.sort(alumnos, new Comparator<Alumno>() {
    
			@Override
			public int compare(Alumno o1, Alumno o2) {
				// TODO Auto-generated method stub
				 return o1.getDNI().compareTo(o2.getDNI());
			}
        });

    }

	@Override
	public String toString() {
		return "Alumnos del centro: " + nombreCentro + '\n' + alumnos ;
	}
	
	
	
}
