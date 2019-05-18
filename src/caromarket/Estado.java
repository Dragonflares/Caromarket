package caromarket;

public interface Estado {

}

class Creada implements Estado {
	public void cancelar(Compra compra) {
		compra.setEstado(new Cancelada)
	}
}

class EnEspera implements Estado {
	public void enviarCompra(Compra compra) {
		compra.setEstado(new Enviada)
	}
	public void cancelar(Compra compra) {
		compra.setEstado(new Cancelada)
	}
}
class Verificada implements Estado {
	public void cancelar(Compra compra) {
		compra.setEstado(new Cancelada)
	}
}
class Cancelada implements Estado {
	
}
class Enviada implements Estado {
	
}