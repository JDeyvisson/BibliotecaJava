public class App {
    public static void main(String[] args) throws Exception {


        LivroDigital livro1 = new LivroDigital("Caminho", "João", 1);
        LivroFisico livro2 = new LivroFisico("AA", "BB", 2);
        LivroDigital livro3 = new LivroDigital("CC", "DD", 3);
        Biblioteca biblioteca = new Biblioteca();
        Usuario João = new Usuario("João", 1);
        Usuario Pedro = new Usuario("Pedro", 2);
        biblioteca.adicionar(livro3);
        biblioteca.listarTodos();
        biblioteca.realizarEmprestimo(João, livro3);
    
        
        //System.out.println(LivroRepo.pesquisarPorISBN(livro2));

    }
}
