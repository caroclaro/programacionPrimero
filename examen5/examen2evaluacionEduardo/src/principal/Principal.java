package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import clases.Estudiante;
import clases.Poeta;
import utility.Generador;

public class Principal {

	public static void main(String[] args) {
		Generador g = new Generador();
		
		  System.out.println("Generando lista de estudiantes . . .");
	       LinkedList<Estudiante> estudiantes = new LinkedList<Estudiante>();
	       estudiantes = Generador.generarEstudiante();

	       for(Estudiante e: estudiantes) {
	    	   System.out.print(e + ", ");
	       }
	       
	       ArrayList<Estudiante> estu10 = new ArrayList<Estudiante>();
	       int numeros[]= new int[10];
	       int j=0;
	       boolean existe=false;
	       while (estu10.size() < 10) {
	            int num = (int) (Math.random() * estudiantes.size());
	            existe = false; 
	            
	            for (int m = 0; m < j; m++) { 
	                if (numeros[m] == num) {
	                    existe = true;
	                    break; 
	                }
	            }
	            
	            if (!existe) {
	                numeros[j] = num; 
	                estu10.add(estudiantes.get(num)); 
	                j++;
	            }
	        }
	        
	       
    	   System.out.println();
	       System.out.println();
	        System.out.println("Estudiantes seleccionados:");
	        for (Estudiante e : estu10) {
	            System.out.println(e);
	        }
	        
	        System.out.println();
	        System.out.println("Generando lista de poetas . . .");
	        ArrayList<Poeta> poetas = Generador.generarPoetas();
	        
	        for(Poeta p: poetas) {
		    	   System.out.print(p + ", ");
		       }
	        
	        System.out.println();
	        System.out.println();
	        System.out.println("Creando mapa");
	        HashMap<Estudiante, Poeta> mapa10 = new HashMap<>();
	        //ITERADOR
	        Iterator<Estudiante> it = estu10.iterator();
	        int contador = 0;
	        while (it.hasNext()) {
	        	mapa10.put(it.next(), poetas.get(contador++));}
	        
	        System.out.println("Mapa de estudiantes y poetas:");
	        Iterator<Map.Entry<Estudiante, Poeta>> it1 = mapa10.entrySet().iterator();
	        while (it1.hasNext()) {
	            Map.Entry<Estudiante, Poeta> entrada = it1.next();
	            System.out.println(entrada.getKey() + " - " + entrada.getValue());
	        }

	}
}
