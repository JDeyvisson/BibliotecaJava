package repositorios;
import entidade.Biblioteca;
import interfaces.IBibliotecaRepositorio;
    
class No {
    Biblioteca biblioteca;
    No proximo;

    public No(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.proximo = null;
    }
}

public class BibliotecaRepositorio implements IBibliotecaRepositorio {
    private No inicio;

    public BibliotecaRepositorio() {
        this.inicio = null;
    }

    public void adicionarBiblioteca(Biblioteca biblioteca) {
        No novoNo = new No(biblioteca);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void listarBibliotecas() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.biblioteca);
            atual = atual.proximo;
        }
    }
}