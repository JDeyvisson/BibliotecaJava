package excecoes;

public class IsbnLivroExcecao extends LivroExcecao{

    public IsbnLivroExcecao(int ISBN) {
        super("ISBN do livro inválido: " + ISBN);
        
    }
    
}
