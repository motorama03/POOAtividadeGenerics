package Atividade03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<Produto> produtos;

	public Pedido() {
        produtos = new ArrayList<>(); // Inicializa a lista no construtor
    }
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void adicionaLista(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        }
    }

    public void retornaLista() {
        for (Produto produto : produtos) {
            System.out.println(produto.getDesc());
            System.out.println(produto.getNome());
        }
    }
}
