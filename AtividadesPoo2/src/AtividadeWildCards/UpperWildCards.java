package AtividadeWildCards;

import java.util.List;

public class UpperWildCards {
	
	public UpperWildCards() {
		
	}
	
	public static void retornaElementos(List<? super Integer> lista) {
		lista.add(42);
	}
	
}
