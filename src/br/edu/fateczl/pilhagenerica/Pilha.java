package br.edu.fateczl.pilhagenerica;

public class Pilha<T> {

    No<T> topo;

    public Pilha() {
        topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    // PUSH
    public void push(T valor) {
        No<T> elemento = new No<>();
        elemento.dado = valor;
        elemento.proximo = topo;
        topo = elemento;
    }

    // POP
    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha Vazia");
        }

        T valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    // TOP
    public T top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha Vazia");
        }
        return topo.dado;
    }

    // SIZE
    public int size() {
        int cont = 0;
        No<T> auxiliar = topo;

        while (auxiliar != null) {
            cont++;
            auxiliar = auxiliar.proximo;
        }

        return cont;
    }

    // LIST
    public void list() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha Vazia");
        }

        No<T> auxiliar = topo;

        while (auxiliar != null) {
            System.out.print(auxiliar.toString() + " ");
            auxiliar = auxiliar.proximo;
        }
    }
}