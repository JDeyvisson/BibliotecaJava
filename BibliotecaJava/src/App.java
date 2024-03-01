public class App {
    public static void main(String[] args) throws Exception {


        LivroDigital livro1 = new LivroDigital("Caminho", "João", 1);
        LivroFisico livro2 = new LivroFisico("AA", "BB", 2);
        LivroRepositorio LivroRepo = new LivroRepositorio();
        LivroRepo.salvar(livro1);
        LivroRepo.salvar(livro2);
        LivroRepo.listarTodos();
        LivroRepo.pesquisarPorISBN(livro1);

    }
}
