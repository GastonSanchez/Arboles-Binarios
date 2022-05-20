package arbolesBinarios;

public class Arbol {
	private Nodo raiz;

	public Arbol(Nodo raiz) {
		this.raiz = raiz;
	}

	public void agregar(int valor) {
		Nodo nuevo = new Nodo(valor);
		if (raiz == null) {
			raiz = nuevo;
		} else {
			if (nuevo.getValor() > raiz.getValor()) {
				raiz.agregarDerecho(agregar(raiz.getDer(), nuevo));
			} else {
				raiz.agregarIzquierda(agregar(raiz.getIzq(), nuevo));
			}
		}
	}

	private Nodo agregar(Nodo padre, Nodo hoja) {
		
		if (padre == null) {
			return hoja;
		} else {
			if (hoja.getValor() > padre.getValor()) {
				padre.agregarDerecho(agregar(padre.getDer(), hoja));
			} else {
				padre.agregarIzquierda(agregar(padre.getIzq(), hoja));
			}
		}

		return padre;
	}

	public String mostrarHijoDerecho() {
		return "Hijo Derecho: " + this.raiz.getDer().getValor();
	}
	public String mostrarHijoIzquierdo() {
		return "Hijo Izquierdo: " + this.raiz.getIzq().getValor();
	}
	@Override
	public String toString() {
		return "raiz=" + raiz.toString();
	}

}
