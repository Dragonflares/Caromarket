package caromarket;

public class Publicacion {
	private int NumeroPublicacion;
	private String NombrePublicacion;
	private int MontoPublicacion;
	
	public Publicacion(int numero, String nombre, int monto) {
		this.NumeroPublicacion = numero;
		this.NombrePublicacion = nombre;
		this.MontoPublicacion = monto;
	}
	
	public int getNumeroPublicacion() {
		return NumeroPublicacion;
	}
	public void setNumeroPublicacion(int numeroPublicacion) {
		NumeroPublicacion = numeroPublicacion;
	}
	public String getNombrePublicacion() {
		return NombrePublicacion;
	}
	public void setNombrePublicacion(String nombrePublicacion) {
		NombrePublicacion = nombrePublicacion;
	}
	public int getMontoPublicacion() {
		return MontoPublicacion;
	}
	public void setMontoPublicacion(int montoPublicacion) {
		MontoPublicacion = montoPublicacion;
	}
	
	
}
