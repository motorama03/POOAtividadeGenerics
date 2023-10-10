package Atividades02;

public class ComercioGenerics<T> {
	private T id;
	private String produto;
	private String dataFabricacao;
	private String dataValidade;
	
	ComercioGenerics(){
	}
	ComercioGenerics(T id, String produto, String dataFabricacao, String dataValidade){
		this.id = id;
		this.produto = produto;
		this.dataFabricacao = dataFabricacao;
		this.dataValidade = dataValidade;
	}
	
	public T getType() {
		return id;
	}
	public void setType(T type) {
		this.id = type;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	@Override
	public String toString() {
		return "ComercioGenerics [id=" + id + ", produto=" + produto + ", dataFabricacao=" + dataFabricacao
				+ ", dataValidade=" + dataValidade + "]";
	}
}
