package arbolesBinarios;

public class Principal {

	public static void main(String[] args) {
		Nodo nuevo = new Nodo(20);
		Arbol ab= new Arbol(nuevo);
		System.out.println(ab.toString());
		ab.agregar(25);
		ab.agregar(11);
		System.out.println(ab.mostrarHijoDerecho());
		System.out.println(ab.mostrarHijoIzquierdo());
	}

}
