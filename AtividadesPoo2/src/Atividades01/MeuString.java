package Atividades01;

public class MeuString{
	private String strr;

	public MeuString(String str) {
		this.strr = str;
	}
	public String getDado() {
		return strr;
	}
	@Override
	public String toString() {
		return strr;
	}
	
}
	//Main MeuString d = new MeuString(“Oi”); String x = d.getStr();