package Atividades04;

public class NodoGeneric<T> {
	private String chave;
	private T valor;
	private NodoGeneric<T> prox;
	
	public NodoGeneric<T> getProx() {
		return prox;
	}

	public void setProx(NodoGeneric<T> prox) {
		this.prox = prox;
	}

	public NodoGeneric(String chave, T valor) {
		this.chave = chave;
		this.valor = valor;
		this.prox = null;
	}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	
}
