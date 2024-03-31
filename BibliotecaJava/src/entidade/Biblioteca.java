package entidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Biblioteca {
    private String local;
    private int numero;
    private ArrayList<Livro> Acervo = new ArrayList<Livro>();
    /* 
    private ArrayList<Livro> livrosBD = new ArrayList<Livro>();
    private Map<Usuario, List<Livro>> emprestimos;

    public Biblioteca() {
        livrosBD = new ArrayList<>();
        emprestimos = new HashMap<>();
    }


    public void adicionar(LivroDigital novolivro){
        livrosBD.add(novolivro);
    }
    public void adicionar(LivroFisico novolivro){
        livrosBD.add(novolivro);
    }
    
    public ArrayList<String> listarTodos() {
        ArrayList<String> informacoesLivros = new ArrayList<>();
    
        for (Livro livro : livrosBD) {
            if (livro instanceof LivroDigital) {
                LivroDigital livroDigital = (LivroDigital) livro;
                informacoesLivros.add(livroDigital.toString());
            } else if (livro instanceof LivroFisico) {
                LivroFisico livroFisico = (LivroFisico) livro;
                informacoesLivros.add(livroFisico.toString());
            }
        }
    
        // Faça algo com as informações, como imprimir no console
        for (String informacao : informacoesLivros) {
            System.out.println(informacao);
        }
    
        // Se necessário, você pode retornar as informações em forma de lista
        return informacoesLivros;
    }
    public Livro pesquisarPorISBN(Livro livroP) {
        Livro resultadoPesquisa = null;
        
        for (Livro livro : livrosBD) {
            if (livro.getISBN() == livroP.getISBN()) {
                // Verifica se o livro é uma instância de LivroDigital ou LivroFisico
                if (livro instanceof LivroDigital || livro instanceof LivroFisico) {
                    resultadoPesquisa = livro;
                    break;
                }
            }
        }
        
        return resultadoPesquisa;
    }
    
    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        if (livro.isStatus()) {
            livro.setStatus(false);

            emprestimos.computeIfAbsent(usuario, k -> new ArrayList<>()).add(livro);

            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void realizarDevolucao(Usuario usuario, Livro livro) {
        if (emprestimos.containsKey(usuario) && emprestimos.get(usuario).contains(livro)) {
            livro.setStatus(true);
            emprestimos.get(usuario).remove(livro);

            System.out.println("Devolução realizada com sucesso.");
        } else {
            System.out.println("Este livro não foi emprestado por este usuário.");
        }
    }
    */
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public ArrayList<Livro> getAcervo() {
        return Acervo;
    }
    public void setAcervo(ArrayList<Livro> acervo) {
        Acervo = acervo;
    }
}