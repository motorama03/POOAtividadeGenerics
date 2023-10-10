package Atividades01;

public class Main {

	public static void main(String[] args) {
		
		ClasseGenerica<String> item01 = new ClasseGenerica<>("óVos");
		System.out.println("Primeiro item: "+item01.getDado());

		ClasseGenerica<Integer> item02 = new ClasseGenerica<>(777);
		System.out.println("Segundo item: "+item02.getDado());

		MeuString anjo = new MeuString("Da minha vidaaaaaa");
		ClasseGenerica<MeuString> item03 = new ClasseGenerica<>(anjo);
		System.out.println("Segundo item: "+item03.getDado());
	
	}

}
