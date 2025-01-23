package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tienda {

	String nombreTienda;
	private ArrayList<Electrodomestico> electrodomesticos;
	
	public Tienda(String nombreTienda) {
		super();
		this.nombreTienda = nombreTienda;
		this.electrodomesticos = new ArrayList<Electrodomestico>();;
	}
	
	public void aniadir(Electrodomestico e) {
		electrodomesticos.add(e);
	}
	
	public void compareTo() {
		Collections.sort(electrodomesticos, new Comparator<Electrodomestico>() {
            @Override
            public int compare(Electrodomestico e1, Electrodomestico e2) {
                return e2.getFechaCompra().compareTo(e1.getFechaCompra());
            }
        });
        System.out.println("***** Objetos ordenados por fecha *********");
       System.out.println();
    }
	
	public void mostrarElectrodomesticos(double precio) {
		double total;
		System.out.println("****** Gasto media diario según caracteristicas ******");
		System.out.println();
		for(Electrodomestico electro: electrodomesticos) {
			if(electro instanceof Lavadora) {
			total = electro.getCosteConsumo(electro.getConsumo(Constantes.H_LAVADORA) , precio );
			System.out.println("Lavadora -> El coste medio diario es de " + total );}
			else{
				total = electro.getCosteConsumo(electro.getConsumo(Constantes.H_FRIGORIFICO), precio );
				System.out.println("Frigorifico -> El coste medio diario es de " + total );
			}
		}
	}

	@Override
	public String toString() {
		return nombreTienda + '\n' + '\n' + electrodomesticos;
	}
	
	
}
