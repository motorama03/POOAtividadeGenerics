package Atividades01;

public class ClasseGenerica<T> {
	
	private T dado;
	
	public ClasseGenerica(T dado){
		setDado(dado);
	}
	
	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}
	
	
}
