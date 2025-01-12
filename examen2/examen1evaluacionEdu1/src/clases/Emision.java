package clases;

import java.lang.reflect.Array;
import java.util.Arrays;

import enums.DiaSemana;

public class Emision {
	
	//max en cada emision
	private static int MAX_TELENECOS = 4;
	//para autoincrementar numero emision
	private static int contador = 0;
	
	//atributos
	private int numeroEmision;
	private DiaSemana diaSemana;
	private Teleneco teleneco;
	private Teleneco[] telenecos;
	
	
	public Emision(DiaSemana diaSemana, Teleneco teleneco) {
		super();
		setNumeroEmision(++contador);
		this.diaSemana = diaSemana;
		setTeleneco(teleneco);
	}

	//show sin teleñeco inicial
	public Emision( DiaSemana diaSemana) {
		super();
		setNumeroEmision(++contador);
		this.diaSemana = diaSemana;
		setTeleneco(null);
	}

	private static int getMAX_TELENECOS() {
		return MAX_TELENECOS;
	}

	private static void setMAX_TELENECOS(int mAX_TELENECOS) {
		MAX_TELENECOS = mAX_TELENECOS;
	}

	private int getNumeroEmision() {
		return numeroEmision;
	}

	private void setNumeroEmision(int num) {
		this.numeroEmision = num;
	}

	private DiaSemana getDiaSemana() {
		return diaSemana;
	}

	private void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	//devuelve el teleneco en la posicion solicitado
	private Teleneco getTeleneco(int i) {
		i = i-1;
		return telenecos[i];
	}

	private void setTeleneco(Teleneco teleneco) {
		if (teleneco == null) {
			Teleneco [] arrTelenecos = new Teleneco[MAX_TELENECOS];
			this.telenecos = arrTelenecos;
		}else {
			Teleneco [] arrTelenecos = new Teleneco[MAX_TELENECOS];
			arrTelenecos[0] = teleneco;
			this.telenecos = arrTelenecos;
		}
		
	}
	
	public boolean hayTeleneco(Teleneco teleneco) {
		for(int i =0; i<telenecos.length; i++) {
			if ((telenecos[i]!=null)&&(telenecos[i].equals(teleneco))) {
				return true;
			}
		}
		return false;
	}
	
	public int numeroTelenecos() {
		int num=0;
		for(int i =0; i<telenecos.length; i++) {
			if(telenecos[i] != null) {
				num++;
			}
		}
		return num;
	}
	
	public boolean estaVacia() {
		for(int i =0; i<telenecos.length; i++) {
			if(telenecos[i]!=null) {
				return false;
			}
		}
		return true;
	}
	
	public boolean estaLlena() {
		for(int i =0; i<telenecos.length; i++) {
			if(telenecos[i]==null) {
				return false;
			}
		}
		return true;
	}
	
	public void agregar(Teleneco teleneco) {
		if(estaLlena()) {
			//se que pone acabar programa, pero para no pararlo constantemente
			throw new IllegalArgumentException("La emisión ya está llena no puedes añadir más");
		}
		if (hayTeleneco(teleneco)) {
			throw new IllegalArgumentException("Ese teleñeco ya está en la emisión");
		}
		else {
			for(int i =0; i<telenecos.length; i++) {
				if(telenecos[i]==null) {
					telenecos[i]=teleneco;
					break;
				}
		}
	}
}

	public void eliminae() {
		if(estaVacia()) {
			//se que pone acabar programa, pero para no pararlo constantemente
			throw new IllegalArgumentException("La emisión ya está vacia, no hay nadie a quien echar");
		}else {
			for(int i = telenecos.length; 0<=i; i--) {
				if(telenecos[i]!=null) {
					telenecos[i]=null;
					break;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Emision [diaSemana=" + diaSemana + ", telenecos=" + Arrays.toString(telenecos) + "]";
	}
	
	
	
	
	
}