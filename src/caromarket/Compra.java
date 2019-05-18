package caromarket;

public class Compra {
	private int NumeroPublicacion;
	private String NombrePublicacion;
	private int MontoCompra;
	private Estado Estado;
	
	public Compra(int numeroPub, String nombrePub, int MonCom) {
		this.NumeroPublicacion = numeroPub;
		this.NombrePublicacion = nombrePub;
		this.MontoCompra = MonCom;
		this.Estado = new Creada();
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
	public int getMontoCompra() {
		return MontoCompra;
	}
	public void setMontoCompra(int montoCompra) {
		MontoCompra = montoCompra;
	}
	public Estado getEstado() {
		return Estado;
	}
	public void setEstado(Estado estado) {
		Estado = estado;
	}
	public void Cancelar() {
		this.Estado.cancelar(this);
	}
}
