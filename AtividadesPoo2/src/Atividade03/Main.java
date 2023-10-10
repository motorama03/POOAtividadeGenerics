package Atividade03;

public class Main {

	public static void main(String[] args) {
		
		//List<Produto> produtos = new ArrayList<Produto>();
		Produto p1 = new Produto("Macarrao", "1Kg");
		Produto p2 = new Produto("Trigo", "5Kg");
		Pedido pedido = new Pedido();
		pedido.adicionaLista(p1);
		pedido.adicionaLista(p2);
		pedido.retornaLista();
	}

}
