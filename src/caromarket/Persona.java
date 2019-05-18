package caromarket;
import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String Nombre;
	private int DNI;
	private List<Compra> compras;
	
	public Persona(String nombre, int dni) {
		this.Nombre = nombre;
		this.DNI = dni;
		this.compras = new ArrayList<Compra>();
	}
	
	public List<Compra> getCompra() {
		return compras;
	}

	public void setCompra(List<Compra> compra) {
		this.compras = compra;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	
	public void comprar(Publicacion publicacion) {
		
		compras.add(new Compra(publicacion.getNumeroPublicacion(), publicacion.getNombrePublicacion(),
				publicacion.getMontoPublicacion()));
	}
	
	public void vender(int IDPub, String nombrePub, int monto) {
		new Publicacion(IDPub, nombrePub, monto);
	}
	
	public void pagar(Compra compra) {
		compra.setEstado(new EnEspera());
	}
	
	public void cancelarCompra(Compra compra) {
		compra.Cancelar();
		compras.remove(compra);
	}
	
	public void enviarCompra(Compra compra) {
		
	}
}
