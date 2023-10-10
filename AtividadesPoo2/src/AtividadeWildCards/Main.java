package AtividadeWildCards;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Unbouded WildCards
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(2);
		lista.add(4);
		lista.add(7);
		lista.add(226);
		UnboudedWildCards coringah = new UnboudedWildCards();
		coringah.retornaElementos(lista);
		coringah.retornaElementosPares(lista);
		
		//Upper Bounded Wildcards
		
		
		//Lower Bounded Wildcards
		
	}

}
