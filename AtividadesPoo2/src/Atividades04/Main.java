package Atividades04;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeadaGeneric<Integer> lista = new ListaEncadeadaGeneric<>();
		lista.inserirOrdenado("Primeiro", 5);
		lista.inserirOrdenado("Segundo", 2);
		lista.inserirOrdenado("Segundo", 2);
		lista.mostraLista();
	}

}
