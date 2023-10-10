package Atividade03;

public class ProdutoX {
	protected String nome;
	protected String desc;
	
	public ProdutoX() {	
	}
	public ProdutoX(String nome, String desc) {
		this.nome = nome;
		this.desc = desc;
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
