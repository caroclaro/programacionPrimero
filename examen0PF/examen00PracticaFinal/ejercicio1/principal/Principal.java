package principal;

import java.time.LocalDate;

import clases.Constantes;
import clases.Frigorifico;
import clases.Lavadora;
import clases.Tienda;

public class Principal {

	public static void main(String[] args) {
		Lavadora l1 = new Lavadora(1.7);
		Frigorifico f1 = new Frigorifico(0.85);
		Frigorifico f2 = new Frigorifico(1.75, LocalDate.of(2023, 5, 1), false);
		Lavadora l2 = new Lavadora(1.75, LocalDate.of(2023, 7, 2), false);
		Lavadora l3 = new Lavadora(1.57, LocalDate.of(2023, 7, 2), true);
		Frigorifico f3 = new Frigorifico(1.75, LocalDate.of(2093, 5, 1), true);
		
		Tienda tienda = new Tienda(Constantes.NOMBRETIENDA);
		tienda.aniadir(l1);
		tienda.aniadir(f1);
		tienda.aniadir(f2);
		tienda.aniadir(l2);
		tienda.aniadir(l3);
		tienda.aniadir(f3);

		System.out.println(tienda);
		tienda.compareTo();
		System.out.println(tienda);
		tienda.mostrarElectrodomesticos(Constantes.PRECIO_KW);
	}
}
