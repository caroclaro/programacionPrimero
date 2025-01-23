package Principal;

import clases.AlumnoDistancia;
import clases.AlumnoParcial;
import clases.AlumnoTiempoTotal;
import clases.Centro;
import excepciones.ExcepcionParcial;

public class Principal {
	
	public static void main(String[] args) {
		
		Centro centro1 = new Centro("Escuela municipal");
		
		AlumnoDistancia a1 = new AlumnoDistancia("Ana Martin", "1234567Y", "aMar", "1234" );
		centro1.nuevoAlumno(a1);
		
		AlumnoDistancia a2 = new AlumnoDistancia("Boris Lopez", "1234567Z", "bLop", "4321" );
		centro1.nuevoAlumno(a2);
		
		AlumnoDistancia a3 = new AlumnoDistancia("Carmen Castro", "1234567O", "cCas", "2341" );
		centro1.nuevoAlumno(a3);
		
		try {
			AlumnoParcial a4 = new AlumnoParcial("Dario Cañada", "32425365C", 30);
			centro1.nuevoAlumno(a4);
		} catch (ExcepcionParcial e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			AlumnoParcial a5 = new AlumnoParcial("Elizabeth Perez", "2355365C", 40);
			centro1.nuevoAlumno(a5);
			
		} catch (ExcepcionParcial e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			AlumnoParcial a6 = new AlumnoParcial("Fabio Fernan", "3243535365C", 70);
			centro1.nuevoAlumno(a6);
		} catch (ExcepcionParcial e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AlumnoTiempoTotal a7 = new AlumnoTiempoTotal("Giulia Guiterrez", "2378482374H");
		centro1.nuevoAlumno(a7);
		
		AlumnoTiempoTotal a8 = new AlumnoTiempoTotal("Hector Jusdado", "123234K");
		centro1.nuevoAlumno(a8);
		
		AlumnoTiempoTotal a9 = new AlumnoTiempoTotal("Ivanna Ivanof", "4482374H");
		centro1.nuevoAlumno(a9);
		
		System.out.println(centro1);
		System.out.println();
		System.out.println();
		centro1.compareTo();
		System.out.println(centro1);

	}
}
