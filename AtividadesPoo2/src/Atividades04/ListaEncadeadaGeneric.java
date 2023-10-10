package Atividades04;

public class ListaEncadeadaGeneric<T extends Comparable<T>> {
    private NodoGeneric<T> inicio;

    public ListaEncadeadaGeneric() {
        inicio = null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public NodoGeneric<T> getInicio() {
        return inicio;
    }

    public void inserirOrdenado(String chave, T valor) {
    	if(inicio != null) {
    		NodoGeneric<T> aux = inicio;
    		while(aux.getProx() != null) {
    			String auxString = aux.getChave();
    			if(auxString == aux.getChave()) {
    				System.out.println(aux.getChave()+" Valor ja inserido");
    				return;
    			}else {
    				aux = aux.getProx();
    			}
    		}
    	}
        NodoGeneric<T> novoNodo = new NodoGeneric<T>(chave, valor);
        if (vazia()) {
            inicio = novoNodo;
            return;
        }
        if (valor.compareTo(inicio.getValor()) < 0) {
            novoNodo.setProx(inicio);
            inicio = novoNodo;
            return;
        }

        NodoGeneric<T> atual = inicio;
        NodoGeneric<T> anterior = null;

        while (atual != null && valor.compareTo(atual.getValor()) > 0) {
            anterior = atual;
            atual = atual.getProx();
        }

        novoNodo.setProx(atual);
        if (anterior != null) {
            anterior.setProx(novoNodo);
        } else {
            inicio = novoNodo;
        }
    }

    public void inserirInicio(String chave, T dado) {
        NodoGeneric<T> novoNodo = new NodoGeneric<T>(chave, dado);
        novoNodo.setProx(inicio);
        inicio = novoNodo;
    }

    public void mostraLista() {
        if (vazia()) {
            System.out.println("Lista Vazia :(");
            return;
        }
        NodoGeneric<T> aux = inicio;
        while (aux != null) {
            System.out.println(aux.getChave()+" "+aux.getValor() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }

    public void removeLista(T valor) {
        if (vazia()) {
            System.out.println("Lista vazia, não é possível excluir :(");
            return;
        }
        if (inicio.getValor().equals(valor)) {
            inicio = inicio.getProx();
            return;
        }
        NodoGeneric<T> aux = inicio;
        while (aux != null) {
            if (aux.getProx() != null && aux.getProx().getValor().equals(valor)) {
                aux.setProx(aux.getProx().getProx());
                return;
            }
            aux = aux.getProx();
        }
    }

    public void deletarUltimo() {
        if (vazia()) {
            return;
        }

        if (inicio.getProx() == null) {
            inicio = null;
            return;
        }

        NodoGeneric<T> aux = inicio;
        NodoGeneric<T> ant = null;

        while (aux.getProx() != null) {
            ant = aux;
            aux = aux.getProx();
        }

        if (ant != null) {
            ant.setProx(null);
        } else {
            inicio = null;
        }
    }

    public int buscarValor(T valor) {
        if (vazia()) {
            return -1;
        }

        NodoGeneric<T> aux = inicio;
        int posicao = 0;
        while (aux != null) {
            posicao++;
            if (aux.getValor().equals(valor)) {
                return posicao;
            }
            aux = aux.getProx();
        }
        return -1;
    }
}
