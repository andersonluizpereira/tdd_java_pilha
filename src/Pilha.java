
public class Pilha {

	private Object[] elementos;
	private int quantidade = 0;
	public Pilha(int maximo) {
		// TODO Auto-generated constructor stub
		elementos = new Object[maximo];
	}

	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return this.quantidade == 0;
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return this.quantidade;
	}

	public void empilha(Object elemento) {
		// TODO Auto-generated method stub
		if(quantidade == elementos.length)
			throw new PilhaCheiaException("Não é possivél empilhar mais elementos.");
		this.elementos[this.quantidade] = elemento;
		this.quantidade++;
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return this.elementos[this.quantidade-1];
	}

	public Object desempilha() {
		// TODO Auto-generated method stub
		if(this.estaVazia())
			throw new PilhaVaziaException("Não é possivél desempilhar.");
		Object topo = this.topo();
		this.quantidade--;
		return topo;
	}

}
