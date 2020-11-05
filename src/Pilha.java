
public class Pilha {

	private Object elemento;
	private int quantidade = 0;
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return (this.elemento == null);
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return this.quantidade;
	}

	public void empilha(Object elemento) {
		// TODO Auto-generated method stub
		this.elemento = elemento;
		this.quantidade++;
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return this.elemento;
	}

}
