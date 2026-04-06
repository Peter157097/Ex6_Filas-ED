package br.edu.fateczl.pilhagenerica;

public class No<T> {

    T dado;
    No<T> proximo;

    public String toString() {
        return "Dado [" + dado + "]";
    }
}