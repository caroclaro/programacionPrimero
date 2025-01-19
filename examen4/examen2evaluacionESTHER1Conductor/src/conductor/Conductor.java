package conductor;

public class Conductor {
	String NIF;
	boolean socio;
	public Conductor(String nIF, boolean socio) {
		super();
		NIF = nIF;
		this.socio = socio;
	}
	private String getNIF() {
		return NIF;
	}
	private void setNIF(String nIF) {
		NIF = nIF;
	}
	private boolean isSocio() {
		return socio;
	}
	private void setSocio(boolean socio) {
		this.socio = socio;
	}
	@Override
	public String toString() {
		return "Conductor [NIF=" + NIF + ", socio=" + socio + "]";
	}
	
	

}
