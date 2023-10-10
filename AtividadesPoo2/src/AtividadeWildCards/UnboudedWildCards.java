package AtividadeWildCards;

import java.util.List;

public class UnboudedWildCards {
	
	public UnboudedWildCards() {
		
	}
	
	public static void retornaElementos(List<?> lista) {
		System.out.println("Todos elementos da lista");
		for(Object elemento : lista) {
			System.out.println(elemento+" ");
		}
	}
	
	public static void retornaElementosPares(List<? extends Number> lista) {
		System.out.println("Elementos Pares");
		for(Object elemento : lista) {
			if(((Number) elemento).doubleValue() % 2 == 0) {
				System.out.println(elemento+" ");
			}
		}
	}
}
