package Atividades02;

public class Main {

	public static void main(String[] args) {
		
		ComercioGenerics<String> comercio = new ComercioGenerics<String>("100001", "Açucar", "02-05-2023", "02-12-2024");
		System.out.println(comercio.toString());
		
		ComercioGenerics<Integer> comercio2 = new ComercioGenerics<Integer>(100002, "Trigo", "02-05-2023", "02-12-2024");
		System.out.println(comercio2.toString());
	}
}
