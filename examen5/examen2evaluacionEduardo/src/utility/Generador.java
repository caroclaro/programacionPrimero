package utility;

import java.util.ArrayList;
import java.util.LinkedList;

import clases.Estudiante;
import clases.Poeta;

public class Generador {
	
	
	
    public Generador() {
		super();
	}

	private static String[] apodos;  
    private static LinkedList<Estudiante> estudiantes = new LinkedList<>();;
	
    
   public static LinkedList<Estudiante> generarEstudiante() {
		apodos = new String[]{  "REYES", "JUANJO", "ZULEMA", "PEDRO", "CAROLINA",
	            "ALEJANDRO", "LEANDRO", "CHRISTIAN", "PABLO",
	            "ROBERTO", "ANYORLINA", "DIEGO", "HECTOR", "JORGE",
	            "LUCAS", "RAUL", "JORDAN", "EMMA", "IVAN", "ALVARO",
	            "JAVI", "DAVID", "ERICK", "ADRI", "INMA"}; 
		
		for(int i = 0; i<apodos.length; i++) {
			estudiantes.add(new Estudiante(apodos[i]));
		}
		return estudiantes;
   }
   
   private static ArrayList<Poeta> poetas = new ArrayList<Poeta>();
	    
   public static ArrayList<Poeta> generarPoetas() {
	   poetas.add(new Poeta( "PABLO", "NERUDA", "CHILE"));
       poetas.add(new Poeta( "FEDERICO", "GARCIA", "ESPAÑA"));
       poetas.add(new Poeta( "OCTAVIO", "PAZ", "MEXICO"));
       poetas.add(new Poeta( "ALFONSINA", "STORNI", "ARGENTINA"));
       poetas.add(new Poeta( "MARIO", "BENEDETTI", "URUGUAY"));
       poetas.add(new Poeta( "GABRIELA", "MISTRAL", "CHILE"));
       poetas.add(new Poeta( "GUSTAVO", "ADOLFO", "ESPAÑA"));
       poetas.add(new Poeta( "CESAR", "VALLEJO", "PERU"));
       poetas.add(new Poeta( "JUAN RAMON", "JIMENEZ", "ESPAÑA"));
       poetas.add(new Poeta( "ANTONIO", "MACHADO", "ESPAÑA"));
	return poetas;
	}
	


}
