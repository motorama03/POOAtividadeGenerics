package Atividade03;

public class Produto extends ProdutoX {
	
	public Produto(String nome, String desc) {
		super(nome, desc);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
