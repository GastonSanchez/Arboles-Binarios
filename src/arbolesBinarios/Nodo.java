package arbolesBinarios;

public class Nodo {
	private int datos;
	private Nodo hijoDer;
	private Nodo hijoIzq;
	
	public Nodo(int datos) {
		super();
		this.datos = datos;
	}
	
	public int getValor () {
		return this.datos;
	}
	
	public Nodo getDer() {
		return this.hijoDer;
	}
	
	public Nodo getIzq() {
		return this.hijoIzq;
	}
	
	public void agregarDerecho(Nodo hoja) {
		this.hijoDer = hoja;
	}
	public void agregarIzquierda(Nodo hoja) {
		this.hijoIzq = hoja;
	}
	
	public void asignar (int dato ) {
		this.datos = dato;
	}

	@Override
	public String toString() {
		return "" + this.datos;
	}

	
	
	
}

