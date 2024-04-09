package repositorios;

import java.util.Stack;

import entidade.Livro;
import interfaces.ILivroRepositorio;

public class LivroRepositorio implements ILivroRepositorio{
    private Stack<Livro> pilhaLivros;

    public LivroRepositorio() {
        pilhaLivros = new Stack<>();
    }

    public void adicionarLivro(Livro livro) {
        pilhaLivros.push(livro);
    }

    public Livro removerLivro() {
        if (!pilhaLivros.isEmpty()) {
            return pilhaLivros.pop();
        }
        return null; // Retorna null se a pilha estiver vazia
    }

    public void exibirLivros() {
        if (!pilhaLivros.isEmpty()) {
            System.out.println("Livros no Repositório:");
            for (Livro livro : pilhaLivros) {
                System.out.println(livro);
            }
        } else {
            System.out.println("O repositório está vazio.");
        }
    }
}

